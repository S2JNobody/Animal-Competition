//Environment. 

class Desert extends Environment {
  public int evaluateAttribute(Attribute basicAttribute) {
    switch (basicAttribute.name) {
      case "strength":
        return basicAttribute.value + 1;
    }
    return basicAttribute.value;
  }
}