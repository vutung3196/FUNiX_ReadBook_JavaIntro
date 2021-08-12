import java.awt.*;

public class Mandelbrot {
    public static int mand(Complex z0, int max) {
        Complex z = z0;
        for (int t = 0; t < max; t++) {
            if (z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return max;
    }

    public static void main(String[] args) {
        double x = -0.5, y = 0;
        double size = 1.5;
        int n = 512;
        int max = 255;
        Picture picture = new Picture(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double x0 = x - size / 2 + size*i / n;
                double y0 = y - size / 2 + size*j / n;
                Complex z0 = new Complex(x0, y0);
                int gray = max - mand(z0, max);
                Color color = new Color(gray, gray, gray);
                picture.set(i, n-1-j, color);
             }
        }
        picture.show();
    }
}
