package package15;

import lib.StdDraw;

public class MouseFollower {

  public static void main(String[] args) {
    StdDraw.enableDoubleBuffering();
    
    while (true) {
      StdDraw.setPenColor(StdDraw.isMousePressed() ? StdDraw.CYAN : StdDraw.BLUE);
      
      StdDraw.clear();
      double x = StdDraw.mouseX();
      double y = StdDraw.mouseY();
      StdDraw.filledCircle(x, y, 0.05);
      StdDraw.show();
      StdDraw.pause(10);
    }
  }

}
