// Parent class for all animals

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Animal {
  
  AttributeValue speed;

  //Map of the names of categories to their list of relevant attributes
  public HashMap<Attributes, AttributeValue> attributes;

  protected Animal(int strengthScore, int agilityScore) {

    attributes = new HashMap<Attributes, AttributeValue>();
    attributes.put(Attributes.STRENGTH, new AttributeValue("Strength", 10));
    attributes.put(Attributes.AGILITY, new AttributeValue("Agility", 10));

  }
}