package package_23;

public class TowerOfHanoi {

  public static void main(String[] args) {
    int n = 3;
    moves(n, false);
  }
  
  static void moves(int n, boolean left) {
    if (n == 0) return;
    moves(n - 1, !left); // Move n-1 discs to auxiliary pole
    System.out.println(n + (left ? " left" : " right")); // Move the n-th to the target pole
    moves(n - 1, !left); // Move n-1 discs to target pole
  }

}
