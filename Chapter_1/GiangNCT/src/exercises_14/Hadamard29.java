package exercises_14;

// 29. takes one command-line argument n and prints H(n) - Hadamard matrix. 
public class Hadamard29 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    boolean[][] hadamard = new boolean[n][n];
    
    hadamard[0][0] = true;
    for (int k = 1; k < n; k += k) {
      for (int i = 0; i < k; i++) {
        for (int j = 0; j < k; j++) {
          hadamard[i + k][j] = hadamard[i][j];
          hadamard[i][j + k] = hadamard[i][j];
          hadamard[i + k][j + k] = !hadamard[i][j];
        }
      }
    }
    
    // display
    for (boolean[] row : hadamard) {
      for (boolean element : row) {
        System.out.print(element ? "* " : ". ");
      }
    }
  }

}
