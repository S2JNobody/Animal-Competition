//Animal, one of the option that can be chosen by users

import java.util.ArrayList;
import java.util.Arrays;

public class Shark extends Animal implements IDescribable {

  public Shark(String name) {
    super(name);
    this.requiredAttributes.add(Attributes.SWIMMING);
  }

  public void describeSelf() {
    System.out.println("SHARK");
    System.out.println("The shark is an animal who benefits from their fast swimming, giving them an edge in battle, speed, and reaching depths that landwellers cannot");
  }
}