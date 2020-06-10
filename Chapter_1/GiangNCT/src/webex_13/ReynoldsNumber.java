package webex_13;

// 79. Reynold's number d * v * rho / mu (assuming all arguments are in SI units). 
// If the Reynold's number is less than 2000, print laminar flow,
// if it's between 2000 and 4000, print transient flow, and if it's more than 4000, print turbulent flow.
public class ReynoldsNumber {

  public static void main(String[] args) {
    double diameter = Double.valueOf(args[0]);
    double velocity = Double.valueOf(args[1]);
    double density = Double.valueOf(args[2]);
    double viscosity = Double.valueOf(args[3]);
    
    double renoldNumber = diameter * velocity * density / viscosity;
    if (renoldNumber < 2000) {
      System.out.println("Laminar flow");
    } else if (renoldNumber < 4000) {
      System.out.println("Trasient flow");
    } else {
      System.out.println("Turbulent flow");
    }
  }

}
