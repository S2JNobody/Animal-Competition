//Gives the capacity to ask the user for input of any type

import java.util.ArrayList;

public interface IReader {

  public String askForMultiplayer();

  public int[] askForAttributeValues(ArrayList<Attributes> animalAttributes);

  public String promptForStringInput(String prompt);
}