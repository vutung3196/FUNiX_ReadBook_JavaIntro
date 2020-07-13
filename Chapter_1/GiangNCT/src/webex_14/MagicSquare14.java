package webex_14;

// 14. Generates a magic square of order n
public class MagicSquare14 {

  public static void main(String[] args) {
    // int n = Integer.valueOf(args[0]);
    int n = 5;
    if (n % 2 == 0) throw new RuntimeException("n must be odd");
    
    int[][] magic = new int[n][n];
    
    int row = n - 1;
    int col = n / 2;
    magic[row][col] = 1;
    
    for (int i = 2; i <= n * n; i++) {
      if (magic[(row + 1) % n][(col + 1) % n] == 0) {
        row = (row + 1) % n;
        col = (col + 1) % n;
      } else {
        row = (row - 1 + n) % n;
      }
      magic[row][col] = i;
    }
    
    // display
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (magic[i][j] < 10) System.out.print(" ");
        if (magic[i][j] < 100) System.out.print(" ");
        System.out.print(magic[i][j] + " ");
      }
      System.out.println();
    }
  }
}
