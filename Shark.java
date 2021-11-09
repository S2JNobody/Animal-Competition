public class Shark extends Animal {
  
  public Shark(String name, int strengthScore, int weightScore, int agilityScore,
                   int climbingScore, int warmthScore, int hungrinessScore,
                   int stealthScore, int cunningScore, int swimmingScore) {
    super(name, strengthScore, weightScore, agilityScore, climbingScore,
          warmthScore, hungrinessScore, stealthScore, cunningScore);
    
    attributes.put(Attributes.SWIMMING, new AttributeValue("Swimming", swimmingScore));

  }
}