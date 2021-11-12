//Class to group Attribues by their weight (Percentage used in calculations)

public class AttributesContainer {

  Attributes[] containedAttributes;
  double weight;

  //The attributes contained in this container, and the percentage of their value that will be used
  public AttributesContainer(Attributes[] containedAttributes, double weight) {
    this.containedAttributes = containedAttributes;

    //The percentage of any attributes of this type which are used in calculations. Stored as decimal from 0-1.
    this.weight = weight;
  }
}