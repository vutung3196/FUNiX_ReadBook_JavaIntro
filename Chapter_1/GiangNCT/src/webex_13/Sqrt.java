package webex_13;

// 31. Modify Sqrt.java so that it reports an error if the user enters a negative number
// and works properly if the user enters zero.
public class Sqrt {

  public static void main(String[] args) {
    double c = Double.valueOf(args[0]);
    double epsilon = 1.0e-15;
    double t = c;
    if (c - 0 < epsilon) {
      t = 0;
      System.out.println("0");
    } else if (c < 0) {
      System.out.println("Invalid c");
    } else {
      while (Math.abs(t - c/t) > epsilon * t) {
        t = (c/t + t) / 2.0;
      }
      
      System.out.println(t);
    }
  }
}
