package webex_13;

// 62. The baseball world series is a best of 7 competition, where the first team to win four games wins the World Series.
// Suppose the stronger team has probability p > 1/2 of winning each game.
// Write a program to estimate the chance that the weaker teams wins the World Series and to estimate how many games on average it will take.
public class WorldSeries {

  public static void main(String[] args) {
    int TRIALS = 1000;
    int games = 0, winChance = 0;
    for (int i = 0; i < TRIALS; i++) {
      int firstWin = 0, secondWin = 0;
      for (int j = 0; j < 7; j++) {
        double res = Math.random();
        if (res < 0.45) secondWin++;
        else firstWin++;
        if (firstWin == 4 || secondWin == 4) {
          games += j;
          if (secondWin == 4) winChance++;
          break;
        }
      }
    }
    System.out.println("Chances to win: " + winChance / 1000.0);
    System.out.println("Average games: " + games / 1000.0);
  }
}
