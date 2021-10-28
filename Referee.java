// This is the class that will make the animals compete. All the logic of how the battle is calculated is done from this class

import java.util.ArrayList;

public class Referee {

  EvaluationCategory fightingCategory;

  public Referee() {
    this.fightingCategory = new EvaluationCategory("Fighting", new Attributes[]{Attributes.STRENGTH, Attributes.WEIGHT});;
  }

  protected String compete(Environment combatEnvironment, Animal competitor1, Animal competitor2) {
    return "";
  }
}