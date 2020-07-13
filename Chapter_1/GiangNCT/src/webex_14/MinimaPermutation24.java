package webex_14;

// 24. takes integers m and n from the command line,
// generates m random permutations of length n, and prints the average number of left-to-right minima in the permutations generated.
public class MinimaPermutation24 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    int m = Integer.valueOf(args[1]);
    int[][] array = new int[m][n];
    for (int row = 0; row < m; row++) {
      for (int i = 0; i < n; i++) {
        array[row][i] = i;
      }
    }
    int sum = 0;
    // n time swaps
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        int seed = (int) (Math.random() * n);
        // swap
        int tmp = array[i][j];
        array[i][j] = array[i][seed];
        array[i][seed] = tmp;
      }
      // display array
      for (int num : array[i]) {
        System.out.print(num + " ");
      }
      System.out.println();
      // count minima
      int minimaCount = 1;
      int min = array[i][0];
      for (int j = 1; j < n; j++) {
        if (min > array[i][j]) {
          min = array[i][j];
          minimaCount++;
        }
      }
      sum += minimaCount;
    }
    System.out.println("Minima number: " + (double) sum / m);
  }

}
