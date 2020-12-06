package package31;

import java.awt.Color;

import lib.Picture;

public class ImageResize {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Picture pic = new Picture("image/greenforest.png");
    Picture newRz = resize(pic, 0.8);
    pic.show();
    newRz.show();
  }
  
  static Picture resize(Picture src, double scale) {
    Picture dst = new Picture((int) (scale * src.width()), (int) (scale * src.height()));
    for (int i = 0; i < dst.width(); ++i) {
      for (int j = 0; j < dst.height(); ++j) {
        int srcCol = i * src.width() / dst.width();
        int srcRow = j * src.height() / dst.height();
        Color pixel = src.get(srcCol, srcRow);
        dst.set(i, j, pixel);
      }
    }
    return dst;
  }

}
