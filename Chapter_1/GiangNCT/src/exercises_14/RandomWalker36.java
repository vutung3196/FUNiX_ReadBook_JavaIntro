package exercises_14;

// 36. Simulates how long it takes n random walkers starting at the center
// of an n-by-n grid to visit every cell in the grid.
public class RandomWalker36 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    int[] x = new int[n];
    int[] y = new int[n];
    int cellsToVisit = 0, steps = 0;
    int r;
    boolean[][] visited = new boolean[n][n];
    
    for (int i = 0; i < n; i++) {
      x[i] = n / 2;
      y[i] = n / 2;
    }
    visited[n/2][n/2] = true;
    cellsToVisit--;

    while (cellsToVisit > 0) {
      steps++;
      for (int i = 0; i < n; i++) {
        r = (int) Math.random() * 4;
        switch(r) {
          case 0: x[i]++; break;
          case 1: x[i]--; break;
          case 2: y[i]++; break;
          case 3: y[i]--; break;
          default: System.out.println("Shouldn't get this!");
        }
        
        if (x[i] < n && y[i] < n && x[i] >= 0 && !visited[x[i]][y[i]]) {
          cellsToVisit--;
          visited[x[i]][y[i]] = true;
        }
      }
    }
    System.out.println(steps);
  }

}
