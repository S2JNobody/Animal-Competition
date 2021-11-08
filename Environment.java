//The Environment changes the value of different attributes for a fight. Later it may also be able to describe itself.

public abstract class Environment {
  
  //Make a map to relate the names of attributes with how they are modified according to the environment

  //Takes in an attribute and returns its value, modified by a certain percentage to either increase it or decrease it
  public abstract double evaluateAttribute(Attributes AttributeType, AttributeValue basicAttributeValue);
}