//Environment. 

class Desert extends Environment {
  public int evaluateAttribute(AttributeValue basicAttributeValue) {
    switch (basicAttributeValue.name) {
      case "strength":
        return basicAttributeValue.value + 1;
    }
    return basicAttributeValue.value;
  }
}