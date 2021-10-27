//The Environment changes the value of different attributes for a fight. Later it may also be able to describe itself.

public abstract class Environment {
  
  //Make a map to relate the names of attributes with how they are modified according to the environment

  //Takes in an attribute and returns the modified value of the Attribute to be used in evaluating the winner
  public abstract int evaluateAttribute(Attribute basicAttribute);
}