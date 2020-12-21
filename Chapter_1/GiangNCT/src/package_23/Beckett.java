package package_23;

public class Beckett {

  public static void main(String[] args) {
    moves(3, true);
  }
  
  static void moves (int n, boolean forward) {
    if (n == 0) return;
    moves(n - 1, true);
    System.out.println((forward ? "Enter: " : "Exit: ") + n);
    moves(n - 1, false);
  }
}
