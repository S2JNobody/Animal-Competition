//Animal class. Currently only used to test if the parent class methods are functional

public class Lion extends Animal {

  public Lion(String name, int strengthScore, int weightScore, int agilityScore,
              int climbingScore, int warmthScore, int hungrinessScore,
              int stealthScore, int cunningScore, int clawSharpnessScore) {
    super(name, strengthScore, weightScore, agilityScore, climbingScore,
          warmthScore, hungrinessScore, stealthScore, cunningScore);
          
    attributes.put(Attributes.CLAW_SHARPNESS, new AttributeValue("Claw Sharpness", clawSharpnessScore));
  }
}