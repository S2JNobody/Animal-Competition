// Parent class for all animals, containing all their common attributes

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public abstract class Animal {
  
  String name;
  //All the Attributes that are needed for all animals
  ArrayList<Attributes> requiredAttributes = new ArrayList<Attributes>(Arrays.asList(Attributes.STRENGTH, Attributes.WEIGHT, Attributes.AGILITY, Attributes.CLIMBING, Attributes.WARMTH, Attributes.HUNGRINESS, Attributes.STEALTH, Attributes.CUNNING));

  //Map of the names of categories to their corresponding AttributeValue
  HashMap<Attributes, AttributeValue> attributes = new HashMap<Attributes, AttributeValue>();

  protected Animal(String name) {
    this.name = name;
    attributes = new HashMap<Attributes, AttributeValue>();
  }

  //Used to populate the HashMap
	protected void setAttributes(ArrayList<AttributeValue> values) {
		for (var value : values) {
      //Is this given attribute one of the ones that the Animal cares about?
      if (requiredAttributes.contains(value.name)) {
        attributes.put(value.name, value);
      }
      //Otherwise, ignore
    }
	}

  protected ArrayList<Attributes> getRequiredAttributes() {
    return requiredAttributes;
  }

  protected HashMap<Attributes, AttributeValue> getAttributes() {
    return this.attributes;
  }

  public String getName() {
    return this.name;
  }
}