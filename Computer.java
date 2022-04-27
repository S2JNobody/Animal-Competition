//A player that is not controlled by a human, and therefore needs no output to talk to it or input to get information from it

import java.util.ArrayList;

public class Computer extends Player {
  
  IReader requester;
  Printer announcer;
  Lion utilityLion = new Lion("UtilityLion");
  Eagle utilityEagle = new Eagle("UtilityEagle");
  Shark utilityShark = new Shark("UtilityShark");

  public Computer(IReader inputMethod, Printer outputMethod) {
    this.requester = inputMethod;
    this.announcer = outputMethod;
  }

  public void createAnimal() {

    //TODO: Make computer choose a random animal
    String animalChoice = "l";

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
      //TODO: 10 is a placeholder number for having random numbers. Randomize
      championAttributeValues.add(new AttributeValue(requiredAnimalAttribute, 10));
    }

    this.champion.setAttributes(championAttributeValues);
    
  }
}