package webex_13;

// 50. prints a (2N + 1)-by-(2N + 1) ex
public class Ex {

  public static void main(String[] args) {
    // int n = Integer.valueOf(args[0]);
    int n = 3;
    for (int i = 0; i < 2 * n + 1; i++) {
      for (int j = 0; j < 2 * n + 1; j++) {
        if (i == j || i == 2 * n - j) {
          System.out.print("* ");
        } else {
          System.out.print(". ");
        }
      }
      System.out.println();
    }
  }

}
