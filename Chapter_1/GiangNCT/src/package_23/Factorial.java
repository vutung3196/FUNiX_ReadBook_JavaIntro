package package_23;

public class Factorial {

  public static void main(String[] args) {
    int n = 5;
    System.out.println(factorial(n));
  }
  
  static int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
    // return (n == 0) ? 1 : n * factorial(n - 1);
  }

}
