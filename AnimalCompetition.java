// The main file of the project. Currently only being used for troubleshooting.

public class AnimalCompetition {
  public static void main(String[] args) {
    System.out.println("The main method is functional.");
    Lion argenold = new Lion("argenold", 10, 10);
    Lion evilArgenold = new Lion("evilArgenold", 12, 12);
    Desert sahara = new Desert();
    Referee john = new Referee();
    System.out.println("The winner is: " + john.compete(sahara, argenold, evilArgenold).name);
  }
}