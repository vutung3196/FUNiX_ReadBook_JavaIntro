package package21;

import lib.StdDraw;

public class FunctionExamples {
  
  // absolute value int
  public static int abs(int x) {
    return x < 0 ? -x : x;
  }
  
  // absolute value double
  public static double abs(double x) {
    return x < 0 ? -x : x;
  }
  
  // prime test
  public static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= n / i; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
  
  // Hypotenuse
  public static double hypotenuse(double a, double b) {
    return Math.sqrt(a * a + b * b);
  }
  
  // Harmonic
  public static double harmonic(int n) {
    double sum = 0.0;
    for (int i = 1; i <= n; i++) {
      sum += 1.0 / i;
    }
    return sum;
  }
  
  // uniform random [0, 1) => [0, n)
  public static int uniform(int n) {
    return (int) (Math.random() * n);
  }
  
  // draw triangle
  public static void drawTriangle(double x0, double y0, double x1, double y1, double x2, double y2) {
    StdDraw.line(x0, y0, x1, y1);
    StdDraw.line(x1, y1, x2, y2);
    StdDraw.line(x0, y0, x2, y2);
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // System.out.println(harmonic(5));
    drawTriangle(0, 0, 0.5, 0.5, 0, 1);
  }

}
