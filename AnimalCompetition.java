// The main file of the project. Also controls the progression in which game events happen

public class AnimalCompetition {
  public static void main(String[] args) {
    Printer announcer = new Printer();
    ConsoleReader requester = new ConsoleReader();

    announcer.printIntroduction();
    String userMultiplayerChoice = requester.askForMultiplayer();

    Player player1 = new User(requester, announcer, requester.promptForStringInput("What will player 1's name be?"));
    Player player2;
    
    if (userMultiplayerChoice.equals("c")) {
      player2 = new Computer(requester, announcer, "CPU");
    } else {
      player2 = new User(requester, announcer, requester.promptForStringInput("What will player 2's name be?"));
    }

    player1.createAnimal();
    player2.createAnimal();

    Referee ref = new Referee();

    //Randomly choose an environment, this here is a PLACEHOLDER
    Environment combatEnvironment = ref.getRandomEnvironment();

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
    EvaluationCategory[] competitionCategories = ref.getCategories();

    announcer.displayEnvironmentInformation(player1, player2, combatEnvironment);
    for (EvaluationCategory currentCompetitionCategory : competitionCategories) {
      announcer.displayCategoryInformation(player1, player2, currentCompetitionCategory);
            
      CategoryResult categoryOutcome = currentCompetitionCategory.competeInCategory(combatEnvironment, player1.champion, player2.champion);
      if (categoryOutcome.getWinner() == player1.champion) {
        player1CategoriesWon += 1;
      } else if (categoryOutcome.getWinner() == player2.champion) {
        player2CategoriesWon += 1;
      }

      System.out.println(String.format("%s was the winner of the %s category!", categoryOutcome.getWinner().getName(), currentCompetitionCategory.getName()));
      System.out.println();
    }

    System.out.println("Player 1 won " + player1CategoriesWon + " Categories");
    System.out.println("Player 2 won " + player2CategoriesWon + " Categories");

    if (player1CategoriesWon > player2CategoriesWon) {
      System.out.println(String.format("The winner is %s and their animal, %s!", player1.getName(), player1.champion.getName()));
    } else if (player2CategoriesWon > player1CategoriesWon) {
      System.out.println(String.format("The winner is %s and their animal, %s!", player2.getName(), player2.champion.getName()));
    } else {
      System.out.println("There is a tie! Another game, perhaps?");
    }

    //Calculate the category
    //Show the results

    //Do that for each of the 3 categories

    //Show the score of each player and say who the winner is.



  }
}