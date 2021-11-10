//Animal, one of the option that can be chosen by users

import java.util.ArrayList;
import java.util.Arrays;

public class Shark extends Animal implements IDescribable {
  
  static ArrayList<Attributes> requiredSharkAttributes = new ArrayList<Attributes>(Arrays.asList(Attributes.SWIMMING));

  public Shark(String name, int strengthScore, int weightScore, int agilityScore,
                   int climbingScore, int warmthScore, int hungrinessScore,
                   int stealthScore, int cunningScore, int swimmingScore) {
    super(name, strengthScore, weightScore, agilityScore, climbingScore,
          warmthScore, hungrinessScore, stealthScore, cunningScore);
    
    attributes.put(Attributes.SWIMMING, new AttributeValue("Swimming", swimmingScore));
  }

  public Shark(String name) {
    this(name, 0, 0, 0, 0, 0, 0, 0, 0, 0);
  }

  public void describeSelf() {
    System.out.println("SHARK");
    System.out.println("The shark is an animal who benefits from their fast swimming, giving them an edge in battle, speed, and reaching depths that landwellers cannot");
  }

  public ArrayList<Attributes> getRequiredAttributes() {
    ArrayList<Attributes> totalRequiredAttributes = new ArrayList<Attributes>();
    totalRequiredAttributes.addAll(super.getRequiredAttributes());
    totalRequiredAttributes.addAll(requiredSharkAttributes);
    return totalRequiredAttributes;
  }
}