//Environment. 

class Desert extends Environment {
  public double evaluateAttribute(Attributes AttributeType, AttributeValue basicAttributeValue) {
    switch (AttributeType) {
      case AGILITY:
        return basicAttributeValue.value * 1.2;
      case WEIGHT:
        return basicAttributeValue.value * 0.7;
      case CLIMBING:
        return basicAttributeValue.value * 0.3;
      case HUNGRINESS:
        return basicAttributeValue.value * 1.2;
      case STEALTH:
        return basicAttributeValue.value * 0.8;
      case WARMTH:
        return basicAttributeValue.value * 0.5;
    }
    return (double)basicAttributeValue.value;
  }
}