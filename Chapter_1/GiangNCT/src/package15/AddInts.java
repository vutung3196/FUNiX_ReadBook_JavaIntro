package package15;

import lib.StdIn;
import lib.StdOut;

public class AddInts {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int value = StdIn.readInt();
      sum += value;
    }
    StdOut.println("Sum is: " + sum);
  }

}
