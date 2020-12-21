package casestudy;

import lib.StdIn;
import lib.StdOut;

public class Transition {

  public static void main(String[] args) {
    int n = StdIn.readInt();
    int[][] counts = new int[n][n];
    int[] outDegree = new int[n];
    
    // Accumulate link counts
    while (!StdIn.isEmpty()) {
      int i = StdIn.readInt();
      int j = StdIn.readInt();
      outDegree[i]++;
      counts[i][j]++;
    }
    StdOut.println(n + " " + n);
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        double p = .9 * counts[i][j] / outDegree[i] + .1/n;
        StdOut.printf("%7.2f", p);
      }
      StdOut.println();
    }
  }
}
