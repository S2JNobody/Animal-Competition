public class AnimalCompetition {
  public static void main(String[] args) {
    System.out.println("The main method is functional.");
    Lion argenold = new Lion(10, 10);
    Lion evilAregenold = new Lion(12, 12);
    Desert sahara = new Desert();
    System.out.println(argenold.compete(sahara, evilAregenold));
  }
}
