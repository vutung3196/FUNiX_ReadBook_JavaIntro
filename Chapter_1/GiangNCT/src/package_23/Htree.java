package package_23;

import lib.StdDraw;

public class Htree {

  public static void main(String[] args) {
    int n = 9;
    double x = 0.5, y = 0.5;
    double size = 0.5;
    draw(n, x, y, size);
  }
  
  // Draw 1-H
  static void drawH(double x, double y, double size) {
    // 4 tips
    double x0 = x - size / 2;
    double x1 = x + size / 2;
    double y0 = y - size / 2;
    double y1 = y + size / 2;
    
    // 3 lines
    StdDraw.line(x0, y0, x0, y1);
    StdDraw.line(x1, y0, x1, y1);
    StdDraw.line(x0, y, x1, y);
  }
  
  // Draw all
  static void draw(int n, double x, double y, double size) {
    if (n == 0) return;
    drawH(x, y, size);
    
    // 4 tips / centers
    double x0 = x - size / 2;
    double x1 = x + size / 2;
    double y0 = y - size / 2;
    double y1 = y + size / 2;
    
    // Recursion
    draw(n - 1, x0, y0, size / 2);
    draw(n - 1, x1, y0, size / 2);
    draw(n - 1, x0, y1, size / 2);
    draw(n - 1, x1, y1, size / 2);
  }
}
