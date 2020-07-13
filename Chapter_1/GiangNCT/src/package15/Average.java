package package15;

import lib.StdIn;
import lib.StdOut;

public class Average {

  public static void main(String[] args) {
    int count = 0;
    double sum = 0.0;
    
    // Read inputs
    while (!StdIn.isEmpty()) {
      double num = StdIn.readDouble();
      sum += num;
      count++;
    }
    
    double avg = sum / count;
    StdOut.printf("Average: %.2f", avg);

  }

}
