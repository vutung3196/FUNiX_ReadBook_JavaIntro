package webex_14;

// Print spiral in n-by-n grid.
public class Spiral27 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    
    int[][] array = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = 1 + n * i + j;
      }
    }
    
    // print
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("%2d ", array[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    
    // spiral
    for (int i = n-1, j = 0; i > 0; i--, j++) {
      for (int k = j; k < i; k++) {
        System.out.println(array[j][k]);
      }
      for (int k = j; k < i; k++) {
        System.out.println(array[k][i]);
      }
      for (int k = i; k < j; k--) {
        System.out.println(array[i][k]);
      }
      for (int k = i; k < j; k--) {
        System.out.println(array[k][j]);
      }
    }
    
    // if n is odd => middle element
    if (n % 2 != 0) {
      System.out.println(array[(n-1)/2][(n-1)/2]);
    }
  }

}
