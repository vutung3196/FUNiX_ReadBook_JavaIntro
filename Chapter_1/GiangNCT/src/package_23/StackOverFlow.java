package package_23;

public class StackOverFlow {
  static double harmonicNoBase(int n) {
    return harmonicNoBase(n - 1) + (1.0/n);
  }
  
  static double harmonicNoConverge(int n) {
    return n == 1 ? 1 : harmonicNoConverge(n) + (1.0/n);
  }
  
  static double harmonic(int n) {
    return n == 0 ? 0.0 : harmonic(n - 1) + (1.0/n);
  }

  public static void main(String[] args) {
    int n = 5000000;
    //System.out.println(harmonicNoBase(n));
//    System.out.println(harmonicNoConverge(n));
    System.out.println(harmonic(n));
  }

}
