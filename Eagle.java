public class Eagle extends Animal {
  public Eagle(String name, int strengthScore, int weightScore, int agilityScore,
                   int climbingScore, int warmthScore, int hungrinessScore,
                   int stealthScore, int cunningScore, int flightScore) {
    super(name, strengthScore, weightScore, agilityScore, climbingScore,
          warmthScore, hungrinessScore, stealthScore, cunningScore);
    
    attributes.put(Attributes.FLIGHT, new AttributeValue("Flight", flightScore));

  }
}