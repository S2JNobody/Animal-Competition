// Parent class for all animals, containing all their common attributes

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public abstract class Animal {
  
  String name;
  //All the Attributes that are needed for all animals
  static ArrayList<Attributes> requiredAttributes = new ArrayList<Attributes>(Arrays.asList(Attributes.STRENGTH, Attributes.WEIGHT, Attributes.AGILITY, Attributes.CLIMBING, Attributes.WARMTH, Attributes.HUNGRINESS, Attributes.STEALTH, Attributes.CUNNING));

  //Map of the names of categories to their corresponding AttributeValue
  HashMap<Attributes, AttributeValue> attributes = new HashMap<Attributes, AttributeValue>();

  protected Animal(String name) {
    this.name = name;
    attributes = new HashMap<Attributes, AttributeValue>();
  }

  //Used to populate the HashMap
	protected void setAttributes(ArrayList<AttributeValue> values) {
		for (int i = 0;i < values.size();i++) {
      //Here it can be checked that the attributes given are correct
      attributes.put(requiredAttributes.get(i), values.get(i));
    }
	}

  protected List<Attributes> getRequiredAttributes() {
    return requiredAttributes;
  }

  protected HashMap<Attributes, AttributeValue> getAttributes() {
    return this.attributes;
  }

  public String getName() {
    return this.name;
  }
}