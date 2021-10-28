// A class to hold together the attribute of a category. Will later also be able to describe itself.

import java.util.ArrayList;

class EvaluationCategory {
  
  Attributes[] relevantAttributes;
  String name;

  public EvaluationCategory(String name, Attributes[] relevantAttributes) {
    this.name = name;
    this.relevantAttributes = relevantAttributes;
  }

  //This method was cut from the Animal parent class, since the old model of the project had the Animal class evaluating the Categories.

  /*
  //Takes in the environment the battle takes place in, the opposing animal, and the category that the animals are being evaluated on
  private String competeInCategory(Environment combatEnvironment, Animal competitor, String category) {

    //The animal with the highest score will be the winner
    var animal1CategoryScore = 0;
    var animal2CategoryScore = 0;
    for (Attribute categoryAttribute : this.categoriesAttributes.get(category)) {
      
      //Attributes are modified based on the environment
      animal1CategoryScore += combatEnvironment.evaluateAttribute(categoryAttribute);
    }
    for (Attribute categoryAttribute : competitor.categoriesAttributes.get(category)) {

      //Same as above
      animal2CategoryScore += combatEnvironment.evaluateAttribute(categoryAttribute);
    }
    if (animal1CategoryScore > animal2CategoryScore) {
      return "Animal 1 was the winner!";
    } else if (animal1CategoryScore < animal2CategoryScore) {
      return "Animal 2 was the winner!";
    } else if (animal1CategoryScore == animal2CategoryScore) {
      return "The animals are evenly matched!";
    }
    return "";
  }
  */
}