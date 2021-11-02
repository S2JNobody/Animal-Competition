// This is the class that will make the animals compete. All the logic of how the battle is calculated is done from this class

import java.util.ArrayList;

public class Referee {

  EvaluationCategory fightingCategory;
  EvaluationCategory movementCategory;
  EvaluationCategory[] competitionCategories = new EvaluationCategory[2];

  public Referee() {
    this.fightingCategory = new EvaluationCategory("Fighting", new Attributes[]{Attributes.STRENGTH, Attributes.WEIGHT});
    this.movementCategory = new EvaluationCategory("Movement", new Attributes[]{Attributes.AGILITY, Attributes.CLIMBING});

    this.competitionCategories[0] = this.fightingCategory;
    this.competitionCategories[1] = this.movementCategory;
  }

  public Animal compete(Environment combatEnvironment, Animal competitor1, Animal competitor2) {
    int competitor1CategoriesWon = 0;
    int competitor2CategoriesWon = 0;
    Animal categoryWinner;
    for (EvaluationCategory competitionCategory : competitionCategories) {
      categoryWinner = competitionCategory.competeInCategory(combatEnvironment, competitor1, competitor2);
      if (categoryWinner == competitor1) {
        competitor1CategoriesWon += 1;
      } else if (categoryWinner == competitor2) {
        competitor2CategoriesWon += 1;
      }
    }
    System.out.println(competitor1CategoriesWon);
    System.out.println(competitor2CategoriesWon);
    Animal winner = null;
    if (competitor1CategoriesWon > competitor2CategoriesWon) {
      winner = competitor1;
    } else if (competitor1CategoriesWon < competitor2CategoriesWon) {
      winner = competitor2;
    }
    return winner;
  }
}