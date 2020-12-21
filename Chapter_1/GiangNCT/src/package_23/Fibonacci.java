package package_23;

public class Fibonacci {
  public static final int LIMIT = 100;
  private static long[] f = new long[LIMIT];
  
  static long topDownFib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (f[n] > 0) return f[n];
    return topDownFib(n - 1) + topDownFib(n - 2);
  }
  
  static long naiveFib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
//    if (f[n] > 0) return f[n];
    return topDownFib(n - 1) + topDownFib(n - 2);
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
//     System.out.println(topDownFib(45));
     System.out.println(naiveFib(45));
  }

}
