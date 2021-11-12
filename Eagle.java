//Animal, one of the options that can be chosen by users

import java.util.ArrayList;
import java.util.Arrays;

public class Eagle extends Animal implements IDescribable {

  public Eagle(String name) {
    super(name);
    this.requiredAttributes.add(Attributes.FLIGHT);
  }

  public void describeSelf() {
    System.out.println("EAGLE");
    System.out.println("The eagle is an animal that uses its flight to move swiftly, reach places other animals cannot, and evade the attacks of other animals in a fight");
  }
}