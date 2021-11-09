import java.util.Scanner;

public class ConsoleReader implements IReader {
  
  Scanner requester = new Scanner(System.in);

  public String askForMultiplayer() {
    String userInput;
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

  public String askForName(String name) {
    System.out.printf("What will %s's name be?", name);
    return(this.requester.nextLine());
  }

  public String askForAnimalChoice(String chooserName) {
    System.out.printf("%s, which animal would you like? Input (l) for lion, (e) for eagle, or (s) for shark");
    return(requester.nextLine());
  }
}