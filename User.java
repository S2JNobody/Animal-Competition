//This class is used by an actual person playing the game.

import java.util.ArrayList;

public class User extends Player {
  
  
  IReader requester;
  Printer announcer;
  Lion utilityLion = new Lion("UtilityLion");
  Eagle utilityEagle = new Eagle("UtilityEagle");
  Shark utilityShark = new Shark("UtilityShark");

  public User(IReader inputMethod, Printer outputMethod, String name) {
    this.requester = inputMethod;
    this.announcer = outputMethod;
    this.name = name;
  }

  public void createAnimal() {
    this.announcer.displayAnimalTypesInformation();
    String animalChoice = this.requester.promptForStringInput(String.format("%s, which animal would you like? Input (l) for lion, (e) for eagle, or (s) for shark", this.name));

    String championName = this.requester.promptForStringInput(String.format("%s, what would you like the name of your animal to be?", this.name));


    //TODO1: Get the values from the requester into the champion
    //TODO2: Get the constructor for the champion to take an arbitrary number of values by reworking the Animals to take in a HashMap and check for the correct Attributes enums.
    ArrayList<AttributeValue> userChosenAttributeValues;
    //TODO: make a valid input detection loop
    if (animalChoice.equals("l")) {
      userChosenAttributeValues = this.requester.askForAttributeValues(utilityLion.getRequiredAttributes());
      this.champion = new Lion(championName);
      this.champion.setAttributes(userChosenAttributeValues);
    } else if (animalChoice.equals("e")) {
      userChosenAttributeValues = this.requester.askForAttributeValues(utilityEagle.getRequiredAttributes());
      this.champion = new Eagle(championName);
      this.champion.setAttributes(userChosenAttributeValues);
    } else if (animalChoice.equals("s")) {
      userChosenAttributeValues = this.requester.askForAttributeValues(utilityShark.getRequiredAttributes());
      this.champion = new Shark(championName);
      this.champion.setAttributes(userChosenAttributeValues);
    }
  }

  public void describeSelf() {
    System.out.println("A user is a player in the game which is controlled by an actual person");
  }
}