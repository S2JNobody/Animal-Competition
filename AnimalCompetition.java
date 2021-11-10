// The main file of the project. Currently only being used for troubleshooting.

public class AnimalCompetition {
  public static void main(String[] args) {
    Printer announcer = new Printer();
    ConsoleReader requester = new ConsoleReader();

    announcer.printIntroduction();
    String userMultiplayerChoice = requester.askForMultiplayer();

    User player1 = new User(requester, announcer, requester.askForName("player 1"));
    IPlayable player2;

    System.out.println(userMultiplayerChoice);

    if (userMultiplayerChoice.equals("c")) {
      player2 = new Computer(requester, announcer);
    } else {
      player2 = new User(requester, announcer, requester.askForName("player 2"));
    }

    player1.createAnimal();

    
    Lion argenold = new Lion("argenold", 10, 10, 10, 10, 10, 10, 10, 10, 10);
    Lion evilArgenold = new Lion("evilArgenold", 12, 12, 10, 9, 10, 10, 10, 10, 10);
    Eagle bert = new Eagle("Bert", 10, 10, 10, 10, 10, 10, 10, 10, 9000);
    Shark gerbert = new Shark("Gerbert", 15, 15, 15, 15, 15, 15, 15, 15, 50);
    Desert sahara = new Desert();
    Jungle amazon = new Jungle();
    Rainfall hurricaneGertrude = new Rainfall();
    Referee john = new Referee();
    Animal winner = john.compete(hurricaneGertrude, gerbert, evilArgenold);
    if (winner != null) {
      System.out.println("The winner is: " + winner.name);
    } else {
      System.out.println("There was a tie!");
    }
  }
}