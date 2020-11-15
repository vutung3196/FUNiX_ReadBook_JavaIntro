package package22;

import lib.StdArrayIO;
import lib.StdDraw;
import lib.StdRandom;

public class IFS {

  public static void main(String[] args) {
    // density
    int trials = Integer.valueOf(args[0]);
    
    // probability distribution for choosing each
    double[] dist = StdArrayIO.readDouble1D();
    
    // update matrices
    double[][] cx = StdArrayIO.readDouble2D();
    double[][] cy = StdArrayIO.readDouble2D();
    
    // current value of (x, y)
    double x = 0.0, y = 0.0;
    
    // do trials iterations of the chaos game
    StdDraw.enableDoubleBuffering();
    for (int t = 0; t < trials; t++) {
      // pick a random rule according to the probability
      int r = StdRandom.discrete(dist);
      
      // do the update
      double x0 = cx[r][0] * x + cx[r][1] * y + cx[r][2];
      double y0 = cy[r][0] * x + cy[r][1] * y + cy[r][2];
      x = x0;
      y = y0;
      
      // draw the resulting point
      StdDraw.point(x, y);
      
      // for efficiency, display only every 100 iteration
      if (t % 100 == 0) {
        StdDraw.show();
        StdDraw.pause(10);
      }
    }
    
    // ensure everything gets drawn
    StdDraw.show();
  }

}
