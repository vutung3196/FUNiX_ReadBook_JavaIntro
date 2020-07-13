package package15;

import lib.StdIn;
import lib.StdOut;

public class TwentyQuestions {

  public static void main(String[] args) {
    // Gen random int
    int secret = 1 + (int) (Math.random() * 1000000);
    secret = 50;
    
    // guess
    int guess = 0;
    while (guess != secret) {
      // Read
      StdOut.print("Guess: ");
      guess = StdIn.readInt();
      StdOut.println((guess < secret ? "Too low" : (guess == secret ?
          "You win" : "Too high")) + "!");
    }
  }

}
