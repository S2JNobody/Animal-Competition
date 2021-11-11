//The class used to make the categories the players compete in to get points. Can take in all the information about the players animals, and the environment to find out who wins the category. Each category instance can use each attribute differently, or not at all

import java.util.ArrayList;

class EvaluationCategory {
  
  String name;
  String description;

  //All the attributes that the category cares about, organized into Containers by percentage used (a.k.a weight)
  ArrayList<AttributesContainer> relevantAttributesContainers;
  
  public EvaluationCategory(String name, String description, ArrayList<AttributesContainer> relevantAttributesContainers) {
    this.name = name;
    this.description = description;
    this.relevantAttributesContainers = relevantAttributesContainers;
  }

  //Takes in the environment the battle takes place in, the opposing animal, and the category that the animals are being evaluated on
  public CategoryResult competeInCategory(Environment combatEnvironment, Animal competitor1, Animal competitor2) {

    //The animal with the highest score will be the winner
    double competitor1CategoryScore = 0.0;
    double competitor2CategoryScore = 0.0;
    for (AttributesContainer relevantContainer : this.relevantAttributesContainers) {
      for (Attributes relevantAttribute : relevantContainer.containedAttributes) {

        //Attributes are modified based on the environment
        if (competitor1.getAttributes().containsKey(relevantAttribute)) {
          competitor1CategoryScore += combatEnvironment.evaluateAttribute(relevantAttribute, competitor1.attributes.get(relevantAttribute)) * relevantContainer.weight;
        }
        if (competitor2.getAttributes().containsKey(relevantAttribute)) {
          competitor2CategoryScore += combatEnvironment.evaluateAttribute(relevantAttribute, competitor2.attributes.get(relevantAttribute)) * relevantContainer.weight;
        }
      }
    }
    Animal winner = null;
    if (competitor1CategoryScore > competitor2CategoryScore) {
      winner = competitor1;
    } else if (competitor1CategoryScore < competitor2CategoryScore) {
      winner = competitor2;
    }
    return new CategoryResult(winner, competitor1CategoryScore, competitor2CategoryScore);
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return this.description;
  }
}