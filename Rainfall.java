public class Rainfall extends Environment {
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
}