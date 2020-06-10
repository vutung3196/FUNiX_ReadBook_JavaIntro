package webex_13;

// 51. prints a (2N + 1)-by-(2N + 1) bowtie
public class Bowtie {

  public static void main(String[] args) {
    // int n = Integer.valueOf(args[0]);
    int n = 5;
    for (int i = -n; i <= n; i++) {
      for (int j = -n; j <= n; j++) {
        if (i * i <= j * j) System.out.print("* ");
        else System.out.print(". ");
      }
      System.out.println();
    }
  }

}
