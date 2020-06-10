package webex_13;

// 81. Pick a random point (a, b) in the unit circle as in the do-while example.
// Then, set x = 2a sqrt(1 - a^2 - b^2), y = 2b sqrt(1 - a^2 - b^2), z = 1 - 2(a^2 + b^2).
public class PointOnSphere {

  public static void main(String[] args) {
    double a = Math.random();
    double b = Math.random();
    double sqrt = Math.sqrt(1 - Math.pow(a, 2) - Math.pow(b, 2));
    double x = 2 * a * sqrt;
    double y = 2 * b * sqrt;
    double z = 1 - 2 * (Math.pow(a, 2) + Math.pow(b, 2));
    System.out.printf("x: %.2f, y: %.2f, z: %.2f", x, y, z);
  }

}
