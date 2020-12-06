package package31;

import java.awt.Color;

import lib.Picture;

public class GrayScaleComparison {

  public static void main(String[] args) {
    Picture picture = new Picture("image/greenforest.png");
    //int width = picture.width(), height = picture.height();
    Picture grayAvg = average(picture);
    Picture grayLuminace = luminance(picture);
 
    picture.show();
    grayAvg.show();
    grayLuminace.show();
    grayAvg.save("image/grayAvg.png");
    grayLuminace.save("image/grayLuminance.png");
  }

  static Picture average(Picture pic) {
    // Create new picture
    Picture gray = new Picture(pic.width(), pic.height());
    // Change picture
    for (int i = 0; i < pic.width(); ++i) {
      for (int j = 0; j < pic.height(); ++j) {
        Color pixel = pic.get(i, j);
        int avg = (int) ((pixel.getRed() + pixel.getGreen() + pixel.getBlue())/3.0);
        Color greyPixel = new Color(avg, avg, avg);
        gray.set(i, j, greyPixel);
      }
    }
    return gray;
  }
  
  static Picture luminance(Picture pic) {
    // Create new picture
    Picture gray = new Picture(pic.width(), pic.height());
    // Change picture
    for (int i = 0; i < pic.width(); ++i) {
      for (int j = 0; j < pic.height(); ++j) {
        Color pixel = pic.get(i, j);
        // 0.299r+0.587g+0.114b
        int luminance = (int) (0.299 * pixel.getGreen() + 0.587 * pixel.getGreen() + 0.114 * pixel.getBlue());
        Color greyPixel = new Color(luminance, luminance, luminance);
        gray.set(i, j, greyPixel);
      }
    }
    return gray;
  }
  
}
