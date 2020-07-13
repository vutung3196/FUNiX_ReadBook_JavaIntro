package webex_14;

// 10. Given an N-by-N grid with each cell either occupied by an 'X', an 'O', or empty, 
// write a program to find the longest sequence of consecutive 'X's either horizontal,
// vertically, or diagonally.
public class ConnectFour10 {

  public static void main(String[] args) {
    int SIZE = 5;
    // X is true, O is false
    boolean[][] grid = new boolean[SIZE][SIZE];
    // set random
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        int seed = (int) (Math.random() * 2);
        grid[i][j] = seed == 1 ? true : false;
      }
    }
    // display
    for (boolean[] row : grid) {
      for (boolean element : row) {
        System.out.print(element ? "X " : "O ");
      }
      System.out.println();
    }
    int maxLine = 0;
    // check row
    for (boolean[] row : grid) {
      int length = 1;
      for (int i = 1; i < row.length; i++) {
        if (row[i - 1] == row[i]) {
          length++;
          if (length > maxLine) maxLine = length;
        } else {
          length = 1;
        }
      }
    }
    // check column
    for (int i = 0; i < SIZE; i++) {
      int length = 1;
      for (int j = 1; j < SIZE; j++) {
        if (grid[j-1][i] == grid[j][i]) {
          length++;
          if (length > maxLine) maxLine = length;
        } else {
          length = 1;
        }
      }
    }
    // TODO: check bottom right
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        
      }
    }
  }

}
