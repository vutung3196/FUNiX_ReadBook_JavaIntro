package package31;

import java.awt.Color;

import lib.StdDraw;

public class AlbersSquares {

  public static void main(String[] args) {
    StdDraw.setCanvasSize(800, 800);
    // setup color 1
    int red1 = 0, green1 = 90, blue1 = 160;
    Color c1 = new Color(red1, green1, blue1);
    
    // setup color 2
    int red2 = 100, green2 = 100, blue2 = 100;
    Color c2 = new Color(red2, green2, blue2);
    
    // First square
    StdDraw.setPenColor(c1);
    StdDraw.filledSquare(0.25, 0.5, 0.2);
    StdDraw.setPenColor(c2);
    StdDraw.filledSquare(0.25, 0.5, 0.1);
    
    // Second square
    StdDraw.setPenColor(c2);
    StdDraw.filledSquare(0.75, 0.5, 0.2);
    StdDraw.setPenColor(c1);
    StdDraw.filledSquare(0.75, 0.5, 0.1);
  }
}
