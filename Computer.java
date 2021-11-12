//A player that is not controlled by a human, and therefore needs no output to talk to it or input to get information from it

public class Computer extends Player {
  
  IReader requester;
  Printer announcer;
  Animal champion;

  public Computer(IReader inputMethod, Printer outputMethod) {
    this.requester = inputMethod;
    this.announcer = outputMethod;
  }

  public void createAnimal() {
    ;
  }
}