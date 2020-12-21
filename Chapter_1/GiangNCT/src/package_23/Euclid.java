package package_23;

public class Euclid {

  public static void main(String[] args) {
    int a = 1440, b = 408;
    System.out.println("Recursive gcd(" + a + ", " + b + "): " + gcdRecursive(a, b));
    System.out.println("Non-recursive gcd(" + a + ", " + b + "): " + gcdNonRecursive(a, b));
  }
  
  // recursive
  static int gcdRecursive(int p, int q) {
    if (q == 0) return p;
    return gcdRecursive(q, p % q);
  }
  
  // non-recursive
  static int gcdNonRecursive(int p, int q) {
    while (q != 0) {
      int tmp = q;
      q = p % q;
      p = tmp;
    }
    return p;
  }

}
