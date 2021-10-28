// The main file of the project. Currently only being used for troubleshooting.

public class AnimalCompetition {
  public static void main(String[] args) {
    System.out.println("The main method is functional.");
    Lion argenold = new Lion(10, 10);
    Lion evilArgenold = new Lion(12, 12);
    Desert sahara = new Desert();
    Referee john = new Referee();
    john.compete(sahara, argenold, evilArgenold);
  }
}
