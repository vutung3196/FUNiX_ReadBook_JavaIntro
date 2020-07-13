package exercises_14;

// 14. Transpose a square two-dimensional array in place without creating a second array
public class Transpose14 {

  public static void main(String[] args) {
    // Array size
    int SIZE = 5;
    double[][] array = new double[SIZE][SIZE];
    // Define elements and display
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
    // Transpose
    for (int i = 0; i < SIZE; i++) {
      for (int j = i + 1; j < SIZE; j++) {
        double tmp = array[i][j];
        array[i][j] = array[j][i];
        array[j][i] = tmp;
      }
    }
    // Display
    System.out.println("\nTransposed\n");
    for (double[] row : array) {
      for (double element : row) {
        System.out.printf("%.2f ", element);
      }
      System.out.println();
    }
    
  }

}
