//Class to request input from the player in all the situations where it is needed, and acertain that the input is valid

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ConsoleReader implements IReader {
  
  Scanner requester = new Scanner(System.in);

  //Allows for the attributes of animals to be printed to users
  HashMap<Attributes, String> attributeToString = new HashMap<Attributes, String>();

  public ConsoleReader() {
    attributeToString.put(Attributes.STRENGTH, "Strength");
    attributeToString.put(Attributes.WEIGHT, "Weight");
    attributeToString.put(Attributes.AGILITY, "Agility");
    attributeToString.put(Attributes.CLIMBING, "Climbing");
    attributeToString.put(Attributes.WARMTH, "Warmth");
    attributeToString.put(Attributes.HUNGRINESS, "Hungriness");
    attributeToString.put(Attributes.STEALTH, "Stealth");
    attributeToString.put(Attributes.CUNNING, "Cunning");
    attributeToString.put(Attributes.CLAW_SHARPNESS, "Claw Sharpness");
    attributeToString.put(Attributes.FLIGHT, "Flight");
    attributeToString.put(Attributes.SWIMMING, "Swimming");
  }

  //Finds out if the user wants to fight a friend or computer
  public String askForMultiplayer() {
    String userInput;

    //The program will keep asking until the user gives 'c' or 'f'
    while (true) {
      userInput = this.requester.nextLine();
      if (userInput.equals("c") || userInput.equals("f")) {
        break;
      } else {
        System.out.println("Please enter c for computer or f for friend");
      }
    }
    return userInput;
  }

  //Maybe I can get a method that takes in character to accept as well

  //Used for any case in which the program asks for input and takes input without making certain the input is of a certain type
  public String promptForStringInput(String prompt) {
    System.out.printf(prompt);
    return(this.requester.nextLine());
  }

//TODO: Make a animal choice requester that catches bad input
/*
  public String askForAnimalChoice(String chooserName) {
    System.out.printf("%s, which animal would you like? Input (l) for lion, (e) for eagle, or (s) for shark");
    return(requester.nextLine());
  }
  */

  public HashMap<Attributes, AttributeValue> askForAttributeValues(ArrayList<Attributes> requiredAnimalAttributes) {
    System.out.printf("Please enter the values for the attributes of your animal. Each attribute must be given a value from 1-20, whole numbers only.");
    String userInput;
    int userInputValue;
    HashMap<Attributes, AttributeValue> receivedAnimalAttributes = new HashMap<Attributes, AttributeValue>();
    for (Attributes animalAttribute : requiredAnimalAttributes) {
      System.out.printf("What would you like the value of your %s attribute to be?", attributeToString.get(animalAttribute));

      //The loop will keep running until they give a integer from 1-20
      while (true) {

        //This checks that their input was an integer
        userInput = this.requester.nextLine();
        try {
          userInputValue = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
          System.out.println("Please enter a whole number from 1-20");
          continue;
        }

        //Check to make sure the integer is between 1 and 20
        if (userInputValue >= 1 && userInputValue <= 20) {
          receivedAnimalAttributes.put();
          break;
        }
      }
    }
    return animalAttributes;
  }
}