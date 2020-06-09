package webex_13;

// 52. Prints out a (2n+1)-by-(2n+1) diamond
public class Diamond {

  public static void main(String[] args) {
    // int n = Integer.valueOf(args[0]);
    int n = 4;
    for (int i = -n; i <= n; i++) {
      for (int j = -n; j <= n; j++) {
        if (Math.abs(i) + Math.abs(j) <= n) System.out.print("* ");
        else System.out.print(". ");
      }
      System.out.println();
    }
  }

}
