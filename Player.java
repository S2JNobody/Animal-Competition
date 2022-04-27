//Parent class for all anything that plays the game

public abstract class Player implements IDescribable {
  
  Animal champion;
  String name;

  public abstract void createAnimal();

  public String getName() {
    return this.name;
  }
}