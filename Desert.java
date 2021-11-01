//Environment. 

class Desert extends Environment {
  public int evaluateAttribute(Attributes AttributeType, AttributeValue basicAttributeValue) {
    switch (AttributeType) {
      case STRENGTH:
        return basicAttributeValue.value + 1;
    }
    return basicAttributeValue.value;
  }
}