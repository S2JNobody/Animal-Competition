// This is the class that will make the animals compete. All the logic of how the battle is calculated is done from this class

import java.util.ArrayList;
import java.util.Arrays;

public class Referee {

  EvaluationCategory fightingCategory;
  EvaluationCategory movementCategory;
  EvaluationCategory survivalCategory;
  EvaluationCategory[] competitionCategories;

  public Referee() {
    this.fightingCategory = new EvaluationCategory(
      "Fighting", new ArrayList<AttributesContainer>(Arrays.asList(
        new AttributesContainer(new Attributes[]{Attributes.STRENGTH, Attributes.WEIGHT, Attributes.CLAW_SHARPNESS}, 1),
        new AttributesContainer(new Attributes[]{Attributes.STEALTH, Attributes.CUNNING}, 0.75),
        new AttributesContainer(new Attributes[]{Attributes.HUNGRINESS, Attributes.FLIGHT}, 0.50))));
    this.movementCategory = new EvaluationCategory(
      "Movement", new ArrayList<AttributesContainer>(Arrays.asList(
        new AttributesContainer(new Attributes[]{Attributes.AGILITY, Attributes.FLIGHT}, 1),
        new AttributesContainer(new Attributes[]{Attributes.CLIMBING, Attributes.SWIMMING}, 0.75),
        new AttributesContainer(new Attributes[]{Attributes.CUNNING, Attributes.WEIGHT}, 0.50),
        new AttributesContainer(new Attributes[]{Attributes.WEIGHT}, -0.75))));
    this.survivalCategory = new EvaluationCategory(
      "Survival", new ArrayList<AttributesContainer>(Arrays.asList(
        new AttributesContainer(new Attributes[]{Attributes.WARMTH}, 1),
        new AttributesContainer(new Attributes[]{Attributes.CUNNING, Attributes.CLIMBING, Attributes.STEALTH, Attributes.FLIGHT, Attributes.SWIMMING}, 0.50),
        new AttributesContainer(new Attributes[]{Attributes.HUNGRINESS}, -1),
        new AttributesContainer(new Attributes[]{Attributes.WEIGHT}, -0.75))));
    this.competitionCategories = new EvaluationCategory[]{this.fightingCategory, this.movementCategory, this.survivalCategory};
  }

  public Animal compete(Environment combatEnvironment, Animal competitor1, Animal competitor2) {
    int competitor1CategoriesWon = 0;
    int competitor2CategoriesWon = 0;
    Animal categoryWinner;
    for (EvaluationCategory competitionCategory : this.competitionCategories) {
      categoryWinner = competitionCategory.competeInCategory(combatEnvironment, competitor1, competitor2);
      if (categoryWinner == competitor1) {
        competitor1CategoriesWon += 1;
      } else if (categoryWinner == competitor2) {
        competitor2CategoriesWon += 1;
      }
    }
    Animal winner = null;
    if (competitor1CategoriesWon > competitor2CategoriesWon) {
      winner = competitor1;
    } else if (competitor1CategoriesWon < competitor2CategoriesWon) {
      winner = competitor2;
    }
    return winner;
  }
}