//Environment subclass, used for competition evaluation

public class Storm extends Environment {
  public double evaluateAttribute(Attributes AttributeType, AttributeValue basicAttributeValue) {
    switch (AttributeType) {
      case AGILITY:
        return basicAttributeValue.value * 0.7;
      case WEIGHT:
        return basicAttributeValue.value * 1.2;
      case CLIMBING:
        return basicAttributeValue.value * 0.6;
      case STEALTH:
        return basicAttributeValue.value * 1.3;
      case FLIGHT:
        return basicAttributeValue.value * 0.6;
      case CUNNING:
        return basicAttributeValue.value * 1.1;
      case SWIMMING:
        return basicAttributeValue.value * 1.5;
      case WARMTH:
        return basicAttributeValue.value * 1.5;
    }
    return (double)basicAttributeValue.value;
  }

  public String getName() {
    return "Storm";
  }

  public void describeSelf() {
    System.out.println("The rain from the storm lowers the temperature, makes surfaces more slippery, reduces vision, and causes floods");
  }
}