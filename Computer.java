public class Computer implements IPlayable {
  
  IReader requester;
  Printer announcer;

  public Computer(IReader inputMethod, Printer outputMethod) {
    this.requester = inputMethod;
    this.announcer = outputMethod;
  }

  public void createAnimal() {}
}