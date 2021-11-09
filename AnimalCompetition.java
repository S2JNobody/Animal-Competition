// The main file of the project. Currently only being used for troubleshooting.

public class AnimalCompetition {
  public static void main(String[] args) {
    System.out.println("The main method is functional.");
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