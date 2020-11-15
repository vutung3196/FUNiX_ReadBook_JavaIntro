package package15;

import lib.StdIn;
import lib.StdOut;

public class RandomSurfer {
  public static void main(String[] args) {
//      int trials = Integer.parseInt(args[0]);   // number of moves
//      int m = StdIn.readInt();                  // number of pages  - ignore since m = n
//      int n = StdIn.readInt();                  // number of pages
      int trials = 1000000;
      int m = 5;
      int n = 5;
      if (m != n) {
          StdOut.println("m does not equal n");
          return;
      }

      // Read transition matrix.
      double[][] p = new double[n][n];          
      for (int i = 0; i < n; i++)
          for (int j = 0; j < n; j++) 
              p[i][j] = StdIn.readDouble(); 


      int[] freq = new int[n];                  

      // Start at page 0. 
      int page = 4;

      for (int t = 0; t < trials; t++) {

          // Make one random move. 
          double r = Math.random(); 
          double sum = 0.0; 
          for (int j = 0; j < n; j++) {
              // Find interval containing r. 
              sum += p[page][j]; 
              if (r < sum) {
                  page = j;
                  break;
              } 
          } 
          freq[page]++; 
      } 


      // Print page ranks. 
      for (int i = 0; i < n; i++) {
          StdOut.printf("%-8.2f", (double) freq[i] / trials); 
      }
      StdOut.println(); 
  }  
} 
