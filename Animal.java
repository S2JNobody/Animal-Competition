// Parent class for all animals

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Animal {
  
  AttributeValue speed;
  String name;

  //Map of the names of categories to their list of relevant attributes
  public HashMap<Attributes, AttributeValue> attributes;

  protected Animal(String name, int strengthScore, int agilityScore) {
    this.name = name;
    attributes = new HashMap<Attributes, AttributeValue>();
    attributes.put(Attributes.STRENGTH, new AttributeValue("Strength", strengthScore));
    attributes.put(Attributes.AGILITY, new AttributeValue("Agility", agilityScore));
  }
}