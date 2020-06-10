package webex_13;

// 49. prints an N-by-N triangular pattern
public class Triangle {

  public static void main(String[] args) {
    // int n = Integer.valueOf(args[0]);
    int n = 6;
    for (int i =0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(". ");
      }
      for (int j = 0; j < n - i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}
