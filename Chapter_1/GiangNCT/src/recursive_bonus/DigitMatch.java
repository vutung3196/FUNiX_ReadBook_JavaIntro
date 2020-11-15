package recursive_bonus;
// digitMatch(298892, 7892) 3
// digitMatch(380, 0)  1

public class DigitMatch {

  public static void main(String[] args) {
    long a = 298892, b = 7892, c = 380, d = 0;
    System.out.println(digitMatchLoop(a, b));
    System.out.println(digitMatchLoop(c, d));
    System.out.println(digitMatchRecursion(a, b));
    System.out.println(digitMatchRecursion(c, d));
  }
  
  static int digitMatchLoop(long a, long b) {
    if (a < 0 || b < 0) throw new IllegalArgumentException();
    int match = 0;
    if (a * b == 0) {
      return (a % 10 + b % 10) == 0 ? 1 : 0;
    }
    while (a > 0 && b > 0) {
      match += (a % 10 == b % 10) ? 1 : 0;
      a /= 10; b /= 10;
    }
    return match;
  }
  
  static int digitMatchRecursion(long a, long b) {
    if (a < 0 || b < 0) throw new IllegalArgumentException();
    if (a * b == 0) {
      return (a % 10 + b % 10) == 0 ? 1 : 0;
    }
    return ((a % 10 == b % 10) ? 1 : 0)  + digitMatchRecursion(a/10, b/10);
  }
}
