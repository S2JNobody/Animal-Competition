//Animal, one of the options that can be chosen by users

import java.util.ArrayList;
import java.util.Arrays;

public class Lion extends Animal implements IDescribable {
  
  static ArrayList<Attributes> requiredLionAttributes = new ArrayList<Attributes>(Arrays.asList(Attributes.CLAW_SHARPNESS));

  public Lion(String name, int strengthScore, int weightScore, int agilityScore,
              int climbingScore, int warmthScore, int hungrinessScore,
              int stealthScore, int cunningScore, int clawSharpnessScore) {
    super(name, strengthScore, weightScore, agilityScore, climbingScore,
          warmthScore, hungrinessScore, stealthScore, cunningScore);
          
    attributes.put(Attributes.CLAW_SHARPNESS, new AttributeValue("Claw Sharpness", clawSharpnessScore));
  }

  public Lion(String name) {
    this(name, 0, 0, 0, 0, 0, 0, 0, 0, 0);
  }

  public void describeSelf() {
    System.out.println("LION");
    System.out.println("The lion is an animal whose sharp claws prove deadly to any who dare to face it in battle");
  }

  public ArrayList<Attributes> getRequiredAttributes() {
    ArrayList<Attributes> totalRequiredAttributes = new ArrayList<Attributes>();
    totalRequiredAttributes.addAll(super.getRequiredAttributes());
    totalRequiredAttributes.addAll(requiredLionAttributes);
    return totalRequiredAttributes;
  }
}