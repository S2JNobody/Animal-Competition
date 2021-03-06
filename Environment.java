//Parent class of all Environments. Environments are used to determine the score of a user within a category

public abstract class Environment implements IDescribable {
  
  //Takes in an attribute and returns its value, modified by a certain percentage to either increase it or decrease it
  public abstract double evaluateAttribute(Attributes AttributeType, AttributeValue basicAttributeValue);

  public abstract String getName();
  
  public abstract void describeSelf();
}