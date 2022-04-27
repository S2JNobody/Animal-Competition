//Class to give any output that the users need to see

import java.util.HashMap;

public class Printer {
  
  Lion utilityLion = new Lion("UtilityLion");
  Eagle utilityEagle = new Eagle("UtilityEagle");
  Shark utilityShark = new Shark("UtilityShark");

  public void printIntroduction() {
    System.out.println("Welcome to the great Animal Competition!");
    System.out.println("Here you will choose your animal, customize it, and pit it in battle against another!");
    System.out.println("First, would you like to fight a computer or a friend? (Type c for computer and f for friend");
  }

  public void displayAnimalTypesInformation() {
    System.out.println();
    System.out.println("Here are the different animals you can choose from:");
    utilityLion.describeSelf();
    utilityEagle.describeSelf();
    utilityShark.describeSelf();
  }

  public void displayEnvironmentInformation(Player player1, Player player2, Environment combatEnvironment) {
    System.out.println(String.format("The environment in which this competition is taking place is a %s", combatEnvironment.getName()));
    combatEnvironment.describeSelf();
    System.out.println();
  }
  
  public void displayCategoryInformation(Player player1, Player player2, EvaluationCategory comingCategory) {
    //Details on the Category, Environment, and champions will be shown here. Therefore, make EvaluationCategories and Envrionments implement IDescribable
    System.out.println(String.format("The next category %s and %s will be competiting in is the %s category", player1.champion.getName(), player2.champion.getName(), comingCategory.getName()));
    System.out.println(comingCategory.getDescription());
    System.out.println("May the best animal win!");
    System.out.println();
  }

  public void displayUserAnimalAttributes(User userToDisplay) {
    System.out.println(String.format("%s, here are the current attributes of your %s", userToDisplay.getName(), userToDisplay.champion.getName()));
    for (AttributeValue animalAttributeValue : userToDisplay.champion.getAttributes().values()) {
      System.out.println(String.format("%s:  %s", animalAttributeValue.name, animalAttributeValue.value));
    }
  }
}