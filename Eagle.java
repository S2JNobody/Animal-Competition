//Animal, one of the options that can be chosen by users

import java.util.ArrayList;
import java.util.Arrays;

public class Eagle extends Animal implements IDescribable {

  static ArrayList<Attributes> requiredEagleAttributes = new ArrayList<Attributes>(Arrays.asList(Attributes.FLIGHT));

  public Eagle(String name, int strengthScore, int weightScore, int agilityScore,
                   int climbingScore, int warmthScore, int hungrinessScore,
                   int stealthScore, int cunningScore, int flightScore) {
    super(name, strengthScore, weightScore, agilityScore, climbingScore,
          warmthScore, hungrinessScore, stealthScore, cunningScore);
    
    attributes.put(Attributes.FLIGHT, new AttributeValue("Flight", flightScore));
  }

  public Eagle(String name) {
    this(name, 0, 0, 0, 0, 0, 0, 0, 0, 0);
  }

  public void describeSelf() {
    System.out.println("EAGLE");
    System.out.println("The eagle is an animal that uses its flight to move swiftly, reach places other animals cannot, and evade the attacks of other animals in a fight");
  }

  public ArrayList<Attributes> getRequiredAttributes() {
    ArrayList<Attributes> totalRequiredAttributes = new ArrayList<Attributes>();
    totalRequiredAttributes.addAll(super.getRequiredAttributes());
    totalRequiredAttributes.addAll(requiredEagleAttributes);
    return totalRequiredAttributes;
  }
}