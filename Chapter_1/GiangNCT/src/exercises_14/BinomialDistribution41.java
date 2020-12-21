package exercises_14;

// 41. Prints out binomial coefficients such that such that a[n][k] contains 
// the probability that you get exactly k heads when you toss a coin n times.
public class BinomialDistribution41 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    
    double[][] binomial = new double[n+1][];
    
    binomial[1] = new double[3];
    binomial[1][1] = 1.0;
    
    for (int i = 2; i <= n; i++) {
      binomial[i] = new double[i+2];
      for (int k = 1; k < binomial[i].length - 1; k++) {
        binomial[i][k] = 0.5 * (binomial[i-1][k-1] + binomial[i-1][k]);
      }
    }
        
    for (int i = 1; i <= n; i++) {
      for (int k = 1; k < binomial[i].length - 1; k++) {
        System.out.println(binomial[i][k] + " ");
      }
      System.out.println();
    }
  }
}
