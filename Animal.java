//Parent class for all animals

public abstract class Animal {
  
  Attribute strength;
  Attribute speed;

  protected Animal(int strengthScore, int speedScore) {
    this.strength = new Attribute("strength", strengthScore);
    this.speed = new Attribute("speed", speedScore);
  }
}