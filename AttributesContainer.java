public class AttributesContainer {

  Attributes[] containedAttributes;
  double weight;

  //The attributes contained in this container, and the percentage of their value that will be used
  public AttributesContainer(Attributes[] containedAttributes, double weight) {
    this.containedAttributes = containedAttributes;
    this.weight = weight;
  }
}