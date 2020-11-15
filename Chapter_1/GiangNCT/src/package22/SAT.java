package package22;

import lib.StdOut;
import package21.Gaussian;

public class SAT {

  public static void main(String[] args) {
    double z = 1200.0;
    double v = Gaussian.cdf((z - 1019) / 209);
    StdOut.println(v);
  }

}
