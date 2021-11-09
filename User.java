public class User implements IPlayable {
  
  IReader requester;
  Printer announcer;
  String name;

  public User(IReader inputMethod, Printer outputMethod, String name) {
    this.requester = inputMethod;
    this.announcer = outputMethod;
    this.name = name;
  }

  public void createAnimal() {
    this.announcer.displayAnimalTypesInformation();
    String animalChoice = this.requester.askForAnimalChoice(this.name);
    //Now, ask the user for their choice of attribute values
  }
}