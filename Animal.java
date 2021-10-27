//Parent class for all animals

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Animal {
  
  Attribute speed;

  //An arrayList to contain all of the animal attributes that are relevant to the Fighting category
  ArrayList<Attribute> fightingAttributes = new ArrayList<Attribute>();

  //Map of the names of categories to their list of relevant attributes
  HashMap<String, ArrayList<Attribute>> categoriesAttributes = new HashMap<String, ArrayList<Attribute>>();

  protected Animal(int strengthScore, int speedScore) {
    this.speed = new Attribute("speed", speedScore);
    this.fightingAttributes.add(new Attribute("strength", strengthScore));

    this.categoriesAttributes.put("Fighting", this.fightingAttributes);
  }

  //The method to make two animals fight in an environment, and declare a victor/tie
  protected String compete(Environment combatEnvironment, Animal competitor) {
    System.out.println(competeInCategory(combatEnvironment, competitor, "Fighting"));
    return "";
  }


  //Takes in the environment the battle takes place in, the opposing animal, and the category that the animals are being evaluated on
  private String competeInCategory(Environment combatEnvironment, Animal competitor, String category) {

    //The animal with the highest score will be the winner
    int animal1CategoryScore = 0;
    int animal2CategoryScore = 0;
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
}