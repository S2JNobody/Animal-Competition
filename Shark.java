//Animal, one of the option that can be chosen by users

import java.util.ArrayList;
import java.util.Arrays;

public class Shark extends Animal implements IDescribable {
  
  static ArrayList<Attributes> requiredSharkAttributes = new ArrayList<Attributes>(Arrays.asList(Attributes.SWIMMING));

  public Shark(String name) {
    super(name);    
  }

  //Used to populate the HashMap
  public void setAttributes(ArrayList<AttributeValue> values) {
    super.setAttributes(new ArrayList(values.subList(0, values.size()-requiredSharkAttributes.size())));
		for (int i = 0;i < requiredSharkAttributes.size();i++) {
      //Here it can be checked that the attributes given are correct
      attributes.put(requiredAttributes.get(i), values.get(i+values.size()-requiredSharkAttributes.size()));
    }
	}

  public void describeSelf() {
    System.out.println("SHARK");
    System.out.println("The shark is an animal who benefits from their fast swimming, giving them an edge in battle, speed, and reaching depths that landwellers cannot");
  }

  public ArrayList<Attributes> getRequiredAttributes() {
    ArrayList<Attributes> totalRequiredAttributes = new ArrayList<Attributes>();
    totalRequiredAttributes.addAll(super.getRequiredAttributes());
    totalRequiredAttributes.addAll(requiredSharkAttributes);
    return totalRequiredAttributes;
  }
}