import java.util.HashMap;

public class Printer {
    
  public void printIntroduction() {
    System.out.println("Welcome to the great Animal Competition!");
    System.out.println("Here you will choose your animal, customize it, and pit it in battle against another!");
    System.out.println("First, would you like to fight a computer or a friend? (Type c for computer and f for friend");
  }

  public void describe(String described) {
    switch (described) {
      case "Lion":
        System.out.println("LION");
        System.out.println("The lion is an animal whose sharp claws prove deadly to any who dare to face it in battle");
      case "Eagle":
        System.out.println("EAGLE");
        System.out.println("The eagle is an animal that uses its flight to move swiftly, reach places other animals cannot, and evade the attacks of other animals in a fight");
      case "Shark":
        System.out.println("SHARK");
        System.out.println("The shark is an animal who benefits from their fast swimming, giving them an edge in battle, speed, and reaching depths that landwellers cannot");
    }
  }

  public void displayAnimalTypesInformation() {
    System.out.println("Here are the different animals you can choose from:");
    describeAnimal("Lion");
    describeAnimal("Eagle");
    describeAnimal("Shark");
  }
}