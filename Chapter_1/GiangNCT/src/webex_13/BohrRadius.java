package webex_13;

// 75.  finds the radii where the probability of finding the electron in the 4s excited state of hydrogen is zero. 
// The probability is given by: (1 - 3r/4 + r2/8 - r3/192)2 e-r/2, 
// where r is the radius in units of the Bohr radius (0.529173E-8 cm)
public class BohrRadius {

  public static void main(String[] args) {
    //double r = Double.valueOf(args[0]);
    // r = 0, 5, 13 => 3 dif. roots
    // r = 4, 12 => NaN since derivative = 0
    double r = 0;
    double eps = 1e-15;
    double f = 0.0, derivative = 0.0;
    
    for (int i = 0; i < 50; i++) {
      f = 1 - 3 * r / 4 + Math.pow(r, 2) / 8 - Math.pow(r, 3) / 192;
      derivative = -3/4.0 + r / 4 - Math.pow(r, 2) / 64;
      
      r = r - f / derivative;
      if (Math.abs(f) < eps) break;
    }
    System.out.println("Root: " + r);

  }

}
