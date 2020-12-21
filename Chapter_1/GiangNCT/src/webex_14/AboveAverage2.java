package webex_14;

import lib.StdIn;

// 2. takes a command-line argument n, reads in n integers from standard input,
// and prints the fraction of values that are strictly above the average value.
public class AboveAverage2 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    int[] scores = new int[n];
    // Read from std in
    for (int i = 0; i < n; i++) {
      scores[i] = StdIn.readInt();
    }
    // Calculate average value
    int sum = 0;
    for (int score : scores) {
      sum += score;
    }
    double avg = (double) sum / n;
    // Count above average
    int count = 0;
    for (int score : scores) {
      count += score > avg ? 1 : 0;
    }
    // Display result
    System.out.println("Fraction: " + (double) count / n);
  }

}
