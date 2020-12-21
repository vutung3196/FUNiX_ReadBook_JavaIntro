package package21;

public class Gaussian {

  // normal phi(x), probability distribution function
  public static double pdf(double x) {
    return Math.exp(-x * x / 2) / Math.sqrt(2 * Math.PI);
  }
  
  // return pdf(x, mu, sigma), mu = mean, sigma = stddev
  public static double pdf(double x, double mu, double sigma) {
    return pdf((x - mu) / sigma) / sigma;
  }
  
  // return cdf(z) = standard Gaussian cdf using Taylor approximation
  // capitalized PHI(z)
  public static double cdf(double z) {
    if (z < -8.0) return 0.0;
    if (z > 8.0) return 1.0;
    double sum = 0.0, term = z;
    for (int i = 3; sum + term != sum; i += 2) {
      sum += term;
      term = term * z * z / i;
    }
    return 0.5 + sum * pdf(z);
  }
  
  // cdf based on mu, sigma
  public static double cdf(double z, double mu, double sigma) {
    return cdf((z - mu) / sigma);
  }
  
  // Compute z such that cdf(z) = y via bisection search
  public static double inverseCDF(double y) {
    return inverseCDF(y, 0.00000001, -8, 8);
  }
  
  // bisection inverse
  private static double inverseCDF(double y, double delta, double lo, double hi) {
    double mid = lo + (hi - lo) / 2;
    if (hi - lo < delta) return mid;
    if (cdf(mid) > y) return inverseCDF(y, delta, lo, mid);
    else return inverseCDF(y, delta, mid, hi);
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    double z = 0.0, mu = 2.5, sigma = 0.3;
    double y = cdf(z);
    System.out.println(y);
    // 0.0000000003725
    System.out.printf("%.2f", inverseCDF(y));
  }

}
