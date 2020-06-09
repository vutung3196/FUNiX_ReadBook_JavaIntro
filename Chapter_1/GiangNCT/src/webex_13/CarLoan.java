package webex_13;

// 29. Rewrite CarLoan.java from Creative Exercise XYZ so that 
// it properly handles an interest rate of 0% and avoids dividing by 0.
public class CarLoan {

  public static void main(String[] args) {
    double payOff = Double.valueOf(args[0]);
    double year = Double.valueOf(args[1]);
    double rate = Double.valueOf(args[2]);
    if (rate == 0) {
      double payment = (payOff / 12) / year;
      System.out.println("Payment: " + payment);
    } else {
      double n = 12 * year;
      double r = (rate / 100) / 12;
      double payment = payOff * r / (1 - Math.pow(1 + r, -n));
      System.out.println("Payment: " + payment);
    }
  }
}