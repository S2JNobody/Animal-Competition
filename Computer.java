//A player that is not controlled by a human, and therefore needs no output to talk to it or input to get information from it

import java.util.ArrayList;
import java.util.Random;

public class Computer extends Player {
  
  IReader requester;
  Printer announcer;
  Lion utilityLion = new Lion("UtilityLion");
  Eagle utilityEagle = new Eagle("UtilityEagle");
  Shark utilityShark = new Shark("UtilityShark");

  public Computer(IReader inputMethod, Printer outputMethod, String name) {
    this.requester = inputMethod;
    this.announcer = outputMethod;
    this.name = name;
  }

  public void createAnimal() {

    Random rand = new Random();
    
    //TODO: Make computer choose a random animal
    String animalChoice = new String[]{"l", "e", "s"}[rand.nextInt(3)];

    String championName = "Computer Beast";

    ArrayList<AttributeValue> championAttributeValues = new ArrayList<AttributeValue>();
    ArrayList<Attributes> requiredAnimalAttributes;    
    
    if (animalChoice.equals("l")) {
      requiredAnimalAttributes = utilityLion.getRequiredAttributes();
      this.champion = new Lion(championName);
    } else if (animalChoice.equals("e")) {
      requiredAnimalAttributes = utilityLion.getRequiredAttributes();
      this.champion = new Eagle(championName);
    } else if (animalChoice.equals("s")) {
      requiredAnimalAttributes = utilityLion.getRequiredAttributes();
      this.champion = new Shark(championName);
    }
    // By default, the champion will be a lion if something goes wrong
    else {
      requiredAnimalAttributes = utilityLion.getRequiredAttributes();
      this.champion = new Lion(championName);
    }

    for (Attributes requiredAnimalAttribute : requiredAnimalAttributes) {
      // The computers stats will be random numbers from 1 to 20
      championAttributeValues.add(new AttributeValue(requiredAnimalAttribute, rand.nextInt(20) + 1));
    }

    this.champion.setAttributes(championAttributeValues);
    
  }

  public void describeSelf() {
    System.out.println("A computer is a player in the game which is by a simple AI");
  }
}