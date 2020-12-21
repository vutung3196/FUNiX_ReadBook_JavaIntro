package package15;

import lib.StdDraw;
import lib.StdIn;

public class PlotFilter {

  public static void main(String[] args) {
    double x0 = StdIn.readDouble();
    double y0 = StdIn.readDouble();
    double x1 = StdIn.readDouble();
    double y1 = StdIn.readDouble();
    StdDraw.setXscale(x0, x1);
    StdDraw.setYscale(y0, y1);
    
    StdDraw.setPenRadius(0.005);
    
    StdDraw.enableDoubleBuffering();
    
    while(!StdIn.isEmpty()) {
      double x = StdIn.readDouble();
      double y = StdIn.readDouble();
      StdDraw.point(x, y);
    }
    
    StdDraw.show();
  }

}
