// Parent class for all animals, containing all their common attributes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class Animal {
  
  String name;
  //All the Attributes that are needed for all animals
  static ArrayList<Attributes> requiredAttributes = new ArrayList<Attributes>(Arrays.asList(Attributes.STRENGTH, Attributes.WEIGHT, Attributes.AGILITY, Attributes.CLIMBING, Attributes.WARMTH, Attributes.HUNGRINESS, Attributes.STEALTH, Attributes.CUNNING));

  //Map of the names of categories to their corresponding AttributeValue
  HashMap<Attributes, AttributeValue> attributes;

  protected Animal(String name, int strengthScore, int weightScore, int agilityScore,
                   int climbingScore, int warmthScore, int hungrinessScore,
                   int stealthScore, int cunningScore) {
    this.name = name;
    attributes = new HashMap<Attributes, AttributeValue>();
    attributes.put(Attributes.STRENGTH, new AttributeValue("Strength", strengthScore));
    attributes.put(Attributes.WEIGHT, new AttributeValue("Weight", weightScore));
    attributes.put(Attributes.AGILITY, new AttributeValue("Agility", agilityScore));
    attributes.put(Attributes.CLIMBING, new AttributeValue("Climbing", climbingScore));
    attributes.put(Attributes.WARMTH, new AttributeValue("Warmth", warmthScore));
    attributes.put(Attributes.HUNGRINESS, new AttributeValue("Hungriness", hungrinessScore));
    attributes.put(Attributes.STEALTH, new AttributeValue("Stealth", stealthScore));
    attributes.put(Attributes.CUNNING, new AttributeValue("Cunning", cunningScore));
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