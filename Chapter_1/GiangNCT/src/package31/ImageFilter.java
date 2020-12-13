package package31;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.util.Arrays;

import lib.Picture;

public class ImageFilter {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Picture picture = new Picture("image/greenforest.png");
    picture.show();
    // 1. IDENTITY
    /*
    double[] identityMatrix = {0, 0, 0,
                               0, 1, 0,
                               0, 0, 0};
    
    double[] largerIdentity= {0, 0, 0, 0, 0, 
                              0, 0, 0, 0, 0,
                              0, 0, 1, 0, 0,
                              0, 0, 0, 0, 0,
                              0, 0, 0, 0, 0};
    
    double[] darker = {0, 0, 0, 0, 0, 
                       0, 0, 0, 0, 0,
                       0, 0, 0.5, 0, 0,
                       0, 0, 0, 0, 0,
                       0, 0, 0, 0, 0};
    
    double[] lighter = {0, 0, 0, 0, 0, 
                       0, 0, 0, 0, 0,
                       0, 0, 2, 0, 0,
                       0, 0, 0, 0, 0,
                       0, 0, 0, 0, 0};
    convolution(picture, toFloat(lighter)).show();
//    convolution(picture, toFloat(identityMatrix)).show();
//    convolution(picture, toFloat(largerIdentity)).show();
    convolution(picture, toFloat(darker)).show();*/
    // 2. BLUR
    /*
    double[] blurMatrix = {0.11, 0.11, 0.11,
                           0.11, 0.11, 0.11,
                           0.11, 0.11, 0.11};
    
    double[] moreBlur = {0.04, 0.04, 0.04, 0.04, 0.04,
                         0.04, 0.04, 0.04, 0.04, 0.04,
                         0.04, 0.04, 0.04, 0.04, 0.04,
                         0.04, 0.04, 0.04, 0.04, 0.04,
                         0.04, 0.04, 0.04, 0.04, 0.04};
    convolution(picture, toFloat(blurMatrix)).show();
    convolution(picture, toFloat(moreBlur)).show();*/
    // 3. SHARPEN
    /*
    double[] sharpenMatrix = {-0.11, -0.11, -0.11,
                              -0.11, 2 - 0.11, -0.11,
                              -0.11, -0.11, -0.11};
    
    double[] sharpenerMatrix = {-0.22, -0.22, -0.22,
                                -0.22, 2.5 - 0.22, -0.22,
                                -0.22, -0.22, -0.22};
    convolution(picture, toFloat(sharpenerMatrix)).show();
    convolution(picture, toFloat(sharpenMatrix)).show();
    */
  }
  
  static Picture convolution(Picture org, float[] matrix) {
    if (matrix.length % 2 == 0 || !perfectSquare(matrix.length)) {
      System.out.println("Matrix size is invalid");
      return null;
    }
    BufferedImage orgBuff = org.getBufferedImage();
    BufferedImage resultBuff = new BufferedImage(orgBuff.getWidth(), orgBuff.getHeight(), BufferedImage.TYPE_INT_RGB);
    int kernelSz = (int) Math.floor(Math.sqrt(matrix.length));
    Kernel kernel = new Kernel(kernelSz, kernelSz, matrix);
    ConvolveOp operator = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);
    operator.filter(orgBuff, resultBuff);
    Picture result = new Picture(resultBuff);
    return result;
  }

  static boolean perfectSquare(int n) {
    double sq = Math.sqrt((double) n);
    return (sq - Math.floor(sq) == 0);
  }
  
  static float[] toFloat(double[] arr) {
    float[] res = new float[arr.length];
    for (int i = 0; i < arr.length; ++i) {
      res[i] = (float) arr[i];
    }
    return res;
  }
}
