import java.awt.*;

public class Rotation {
    public static void main(String[] args) {
        Picture pic1 = new Picture(args[0]);
        double theta = Double.parseDouble(args[1]);
        double angle = Math.toRadians(theta);
        double cosAngle = Math.cos(angle);
        double sinAngle = Math.sin(angle);
        // show picture 1
        pic1.show();
        int width = pic1.width();
        int height = pic1.height();
        double x0 = (width - 1) * 0.5;
        double y0 = (height - 1) * 0.5;
        Picture pic2 = new Picture(width, height);
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                double a1 = i - x0;
                double a2 = j - y0;
                int ti = (int) (a1 * cosAngle - a2 * sinAngle + x0);
                int tj = (int) (a1 * sinAngle + a2 * cosAngle + y0);
                if (ti >= 0 && ti < width && tj >= 0 && tj < height) {
                    pic2.set(i, j, pic1.get(ti, tj));
                }
            }
        }
        pic2.show();
    }
}
