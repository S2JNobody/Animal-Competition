// A class to hold together the attribute of a category. Will later also be able to describe itself.

import java.util.ArrayList;

class EvaluationCategory {
  
  Attributes[] relevantAttributes;
  String name;

  public EvaluationCategory(String name, Attributes[] relevantAttributes) {
    this.name = name;
    this.relevantAttributes = relevantAttributes;
  }

  //Takes in the environment the battle takes place in, the opposing animal, and the category that the animals are being evaluated on
  public Animal competeInCategory(Environment combatEnvironment, Animal competitor1, Animal competitor2) {
    //The animal with the highest score will be the winner
    var competitor1CategoryScore = 0;
    var competitor2CategoryScore = 0;
    for (Attributes relelvantAttribute : this.relevantAttributes) {

      //Attributes are modified based on the environment
      if (competitor1.attributes.containsKey(relelvantAttribute)) {
        competitor1CategoryScore += combatEnvironment.evaluateAttribute(relelvantAttribute, competitor1.attributes.get(relelvantAttribute));
      }
      if (competitor2.attributes.containsKey(relelvantAttribute)) {
        competitor2CategoryScore += combatEnvironment.evaluateAttribute(relelvantAttribute, competitor2.attributes.get(relelvantAttribute));
      }
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