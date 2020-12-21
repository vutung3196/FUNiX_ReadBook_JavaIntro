package package15;

import lib.StdIn;
import lib.StdOut;

public class RangeFilter {

  public static void main(String[] args) {
    int low = Integer.valueOf(args[0]);
    int high = Integer.valueOf(args[1]);
    while (!StdIn.isEmpty()) {
      int t = StdIn.readInt();
      
      if (t >= low && t <= high) {
        StdOut.print(t + " ");
      }
    }
    StdOut.println();
  }
}
