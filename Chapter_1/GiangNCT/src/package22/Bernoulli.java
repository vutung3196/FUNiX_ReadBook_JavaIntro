package package22;

import lib.StdDraw;
import lib.StdRandom;
import lib.StdStats;
import package21.Gaussian;

public class Bernoulli {

  // number of heads when flipping n biased-p coins
  public static int binomial(int n, double p) {
    int heads = 0;
    for (int i = 0; i < n; i++) {
      if (StdRandom.bernoulli(p)) {
        heads++;
      }
    }
    return heads;
  }
  
  // number of heads when flipping n fair coins
  // or call binomial(n, 0.5)
  public static int binomial(int n) {
    int heads = 0;
    for (int i = 0; i < n; i++) {
      if (StdRandom.bernoulli(0.5)) {
        heads++;
      }
    }
    return heads;
  }
  
  
  public static void main(String[] args) {
    int n = 20;
    int trials = 100000;
    
    StdDraw.setYscale(0, 0.2);
    
    // flip n fair coins, trials times
    int[] freq = new int[n+1];
    for (int t = 0; t < trials; t++) {
      freq[binomial(n)]++;
    }
    
    // plot normalized values
    double[] normalized = new double[n+1];
    for (int i = 0; i <= n; i++) {
      normalized[i] = (double) freq[i] / trials;
    }
    StdStats.plotBars(normalized);
    
    // plot Gaussian approximation
    double mean = n / 2.0;
    double stddev = Math.sqrt(n) / 2.0;
    double[] phi = new double[n+1];
    for (int i = 0; i <= n; i++) {
      phi[i] = Gaussian.pdf(i, mean, stddev);
    }
    StdStats.plotLines(phi);
  }

}
