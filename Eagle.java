//Animal, one of the options that can be chosen by users

import java.util.ArrayList;
import java.util.Arrays;

public class Eagle extends Animal implements IDescribable {
  
  static ArrayList<Attributes> requiredEagleAttributes = new ArrayList<Attributes>(Arrays.asList(Attributes.FLIGHT));

  public Eagle(String name) {
    super(name);    
  }

  //Used to populate the HashMap
  public void setAttributes(ArrayList<AttributeValue> values) {
    super.setAttributes(new ArrayList(values.subList(0, values.size()-requiredEagleAttributes.size())));
		for (int i = 0;i < requiredEagleAttributes.size();i++) {
      //Here it can be checked that the attributes given are correct
      attributes.put(requiredAttributes.get(i), values.get(i+values.size()-requiredEagleAttributes.size()));
    }
	}

  public void describeSelf() {
    System.out.println("EAGLE");
    System.out.println("The eagle is an animal that uses its flight to move swiftly, reach places other animals cannot, and evade the attacks of other animals in a fight");
  }

  public ArrayList<Attributes> getRequiredAttributes() {
    ArrayList<Attributes> totalRequiredAttributes = new ArrayList<Attributes>();
    totalRequiredAttributes.addAll(super.getRequiredAttributes());
    totalRequiredAttributes.addAll(requiredEagleAttributes);
    return totalRequiredAttributes;
  }
}