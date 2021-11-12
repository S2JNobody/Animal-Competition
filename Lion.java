//Animal, one of the options that can be chosen by users

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Lion extends Animal implements IDescribable {
  
  public Lion(String name) {
    super(name);
    this.requiredAttributes.add(Attributes.CLAW_SHARPNESS);
  }

  public void describeSelf() {
    System.out.println("LION");
    System.out.println("The lion is an animal whose sharp claws prove deadly to any who dare to face it in battle");
  }
}