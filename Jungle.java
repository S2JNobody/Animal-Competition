//Environment subclass, used for competition evaluation

public class Jungle extends Environment {
  public double evaluateAttribute(Attributes AttributeType, AttributeValue basicAttributeValue) {
    switch (AttributeType) {
      case AGILITY:
        return basicAttributeValue.value * 0.9;
      case WEIGHT:
        return basicAttributeValue.value * 0.8;
      case CLIMBING:
        return basicAttributeValue.value * 1.5;
      case HUNGRINESS:
        return basicAttributeValue.value * 0.7;
      case STEALTH:
        return basicAttributeValue.value * 1.4;
      case CLAW_SHARPNESS:
        return basicAttributeValue.value * 1.2;
      case FLIGHT:
        return basicAttributeValue.value * 0.8;
      case CUNNING:
        return basicAttributeValue.value * 1.1;
    }
    return (double)basicAttributeValue.value;
  }

  public String getName() {
    return "Jungle";
  }

  public void describeSelf() {
    System.out.println("Jungles are dense, tall forests filled with vines and strange plants");
  }
}