//Container to store the results of two animals competing in a category

public class CategoryResult {
  
  Animal winner;
  double player1Score;
  double player2Score;

  public CategoryResult(Animal winner, double player1Score, double player2Score) {
    this.winner = winner;
    this.player1Score = player1Score;
    this.player2Score = player2Score;
  }

  public Animal getWinner() {
    return winner;
  }

  public double getPlayer1Score() {
    return player1Score;
  }

  public double getPlayer2Score() {
    return player2Score;
  }
}