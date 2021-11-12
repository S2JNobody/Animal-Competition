//Holds all the categories in the game

import java.util.ArrayList;
import java.util.Arrays;

public class Referee {

  EvaluationCategory fightingCategory;
  EvaluationCategory movementCategory;
  EvaluationCategory survivalCategory;
  EvaluationCategory[] competitionCategories;

  public Referee() {

    this.fightingCategory = new EvaluationCategory(
      "Fighting", "The fighting category pits the combatants against each other in battle, with the better fighter emerging victorious",
        new ArrayList<AttributesContainer>(Arrays.asList(
        new AttributesContainer(new Attributes[]{Attributes.STRENGTH, Attributes.WEIGHT, Attributes.CLAW_SHARPNESS}, 1),
        new AttributesContainer(new Attributes[]{Attributes.STEALTH, Attributes.CUNNING}, 0.75),
        new AttributesContainer(new Attributes[]{Attributes.HUNGRINESS, Attributes.FLIGHT}, 0.50))));
    this.movementCategory = new EvaluationCategory(
      "Movement", "The movement category sees if the combatants can evade or catch one another",
        new ArrayList<AttributesContainer>(Arrays.asList(
        new AttributesContainer(new Attributes[]{Attributes.AGILITY, Attributes.FLIGHT}, 1),
        new AttributesContainer(new Attributes[]{Attributes.CLIMBING, Attributes.SWIMMING}, 0.75),
        new AttributesContainer(new Attributes[]{Attributes.CUNNING, Attributes.WEIGHT}, 0.50),
        new AttributesContainer(new Attributes[]{Attributes.WEIGHT}, -0.75))));
    this.survivalCategory = new EvaluationCategory(
      "Survival", "The survival category tests each combatant to see which will outlast the other living in the environment in which they are placed",
        new ArrayList<AttributesContainer>(Arrays.asList(
        new AttributesContainer(new Attributes[]{Attributes.WARMTH}, 1),
        new AttributesContainer(new Attributes[]{Attributes.CUNNING, Attributes.CLIMBING, Attributes.STEALTH, Attributes.FLIGHT, Attributes.SWIMMING}, 0.50),
        new AttributesContainer(new Attributes[]{Attributes.HUNGRINESS}, -1),
        new AttributesContainer(new Attributes[]{Attributes.WEIGHT}, -0.75))));
    this.competitionCategories = new EvaluationCategory[]{this.fightingCategory, this.movementCategory, this.survivalCategory};
  }

  /*
  public Result competeInNextCategory(Environment combatEnvironment, Animal competitor1, Animal competitor2) {
    
    return categoryOutcome;
  }*/

  public EvaluationCategory[] getCategories() {
    return this.competitionCategories;
  }
}