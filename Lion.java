//Animal, one of the options that can be chosen by users

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Lion extends Animal implements IDescribable {
  
  static ArrayList<Attributes> requiredLionAttributes = new ArrayList<Attributes>(Arrays.asList(Attributes.CLAW_SHARPNESS));

  public Lion(String name) {
    super(name);    
  }

  //Used to populate the HashMap
  public void setAttributes(ArrayList<AttributeValue> values) {
    super.setAttributes(new ArrayList(values.subList(0, values.size()-requiredLionAttributes.size())));
		for (int i = 0;i < requiredLionAttributes.size();i++) {
      //Here it can be checked that the attributes given are correct
      attributes.put(requiredAttributes.get(i), values.get(i+values.size()-requiredLionAttributes.size()));
    }
	}

  public void describeSelf() {
    System.out.println("LION");
    System.out.println("The lion is an animal whose sharp claws prove deadly to any who dare to face it in battle");
  }

  public ArrayList<Attributes> getRequiredAttributes() {
    ArrayList<Attributes> totalRequiredAttributes = new ArrayList<Attributes>();
    totalRequiredAttributes.addAll(super.getRequiredAttributes());
    totalRequiredAttributes.addAll(requiredLionAttributes);
    return totalRequiredAttributes;
  }
}