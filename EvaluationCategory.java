// A class to hold together the attribute of a category. Will later also be able to describe itself.

import java.util.ArrayList;

class EvaluationCategory {
  
  ArrayList<AttributesContainer> relevantAttributesContainers;
  String name;
  
  //Major attributes use 100% of their value, intermediate attributes only use 75%, and minor attributes only use 50%
  public EvaluationCategory(String name, ArrayList<AttributesContainer> relevantAttributesContainers) {
    this.name = name;
    this.relevantAttributesContainers = relevantAttributesContainers;
  }

  //Takes in the environment the battle takes place in, the opposing animal, and the category that the animals are being evaluated on
  public Animal competeInCategory(Environment combatEnvironment, Animal competitor1, Animal competitor2) {
    System.out.println("E Change test 3");
    //The animal with the highest score will be the winner
    double competitor1CategoryScore = 0.0;
    double competitor2CategoryScore = 0.0;
    for (AttributesContainer relevantContainer : this.relevantAttributesContainers) {
      for (Attributes relevantAttribute : relevantContainer.containedAttributes) {

        //Attributes are modified based on the environment
        if (competitor1.attributes.containsKey(relevantAttribute)) {
          competitor1CategoryScore += combatEnvironment.evaluateAttribute(relevantAttribute, competitor1.attributes.get(relevantAttribute)) * relevantContainer.weight;
        }
        if (competitor2.attributes.containsKey(relevantAttribute)) {
          competitor2CategoryScore += combatEnvironment.evaluateAttribute(relevantAttribute, competitor2.attributes.get(relevantAttribute)) * relevantContainer.weight;
        }
      }
      System.out.println("Here be scores");
      System.out.println(competitor1CategoryScore);
      System.out.println(competitor2CategoryScore);
    }
    Animal winner = null;
    if (competitor1CategoryScore > competitor2CategoryScore) {
      winner = competitor1;
    } else if (competitor1CategoryScore < competitor2CategoryScore) {
      winner = competitor2;
    }
    return winner;
  }
}