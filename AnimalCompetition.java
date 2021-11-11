// The main file of the project. Also controls the progression in which game events happen

public class AnimalCompetition {
  public static void main(String[] args) {
    Printer announcer = new Printer();
    ConsoleReader requester = new ConsoleReader();

    announcer.printIntroduction();
    String userMultiplayerChoice = requester.askForMultiplayer();

    User player1 = new User(requester, announcer, requester.promptForStringInput("What will player 1's name be?"));
    Player player2;

    System.out.println(userMultiplayerChoice);

    if (userMultiplayerChoice.equals("c")) {
      player2 = new Computer(requester, announcer);
    } else {
      player2 = new User(requester, announcer, requester.promptForStringInput("What will player 2's name be?"));
    }

    player1.createAnimal();
    //Computers are currently not functional.
    player2.createAnimal();

    Referee ref = new Referee();

    //Randomly choose an environment, this here is a PLACEHOLDER
    Desert combatEnvironment = new Desert();

    /*Current changes: EvaluationCategory uses a new type of output
      Referee's only job now is to hold the EvaluationCategories. Do we need it anymore?
    */


    //Show the players the stats for the coming category
      //Show all of P1's attributes
      //Show the environment

    //TODO: Decide whether I should put these IN the player classes
    int player1CategoriesWon = 0;
    int player2CategoriesWon = 0;

    int currentCategory = 0;
    EvaluationCategory currentCompetitionCategory = ref.getCategories()[currentCategory];
    CategoryResult categoryOutcome = currentCompetitionCategory.competeInCategory(combatEnvironment, player1.champion, player2.champion);
    if (categoryOutcome.getWinner() == player1.champion) {
      player1CategoriesWon += 1;
    } else if (categoryOutcome.getWinner() == player2.champion) {
      player2CategoriesWon += 1;
    }
    //Calculate the category
    //Show the results

    //Do that for each of the 3 categories

    //Show the score of each player and say who the winner is.










    Lion argenold = new Lion("argenold", 10, 10, 10, 10, 10, 10, 10, 10, 10);
    Lion evilArgenold = new Lion("evilArgenold", 12, 12, 10, 9, 10, 10, 10, 10, 10);
    Eagle bert = new Eagle("Bert", 10, 10, 10, 10, 10, 10, 10, 10, 9000);
    Shark gerbert = new Shark("Gerbert", 15, 15, 15, 15, 15, 15, 15, 15, 50);
    Desert sahara = new Desert();
    Jungle amazon = new Jungle();
    Rainfall hurricaneGertrude = new Rainfall();
    Referee john = new Referee();
  }
}