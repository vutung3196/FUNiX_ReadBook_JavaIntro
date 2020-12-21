package webex_14;

public class TerrainAnalysis13 {

  public static void main(String[] args) {
    // int SIZE = Integer.valueOf(args[0]);
    int SIZE = 5;
    // Initialize
    double[][] array = new double[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        array[i][j] = Math.random();
      }
    }
    // Display
    for (double[] row : array) {
      for (double element : row) {
        System.out.printf("%.2f ", element);
      }
      System.out.println();
    }
    // Find peaks
    // count peaks
    System.out.println("Peaks: ");
    int count = 0;
    for (int i = 1; i < SIZE - 1; i++) {
      for (int j = 1; j < SIZE - 1; j++) {
        if (array[i][j] > array[i-1][j] && array[i][j] > array[i][j-1]
            && array[i][j] > array[i+1][j] && array[i][j] > array[i][j+1]) {
          System.out.printf("%.2f ", array[i][j]);
          count++;
        }
      }
    }
    // Final result
    System.out.println("\nNumber of peaks: " + count);
  }

}
