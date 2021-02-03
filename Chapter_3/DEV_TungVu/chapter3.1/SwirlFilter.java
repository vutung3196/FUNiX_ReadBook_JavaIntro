public class SwirlFilter {
    public static void main(String[] args) {
        // You can replace args[0] by mandrill.jpg
        Picture pic1 = new Picture(args[0]);
        // show picture 1
        pic1.show();
        int width = pic1.width();
        int height = pic1.height();
        double x0 = (width - 1) * 0.5;
        double y0 = (height - 1) * 0.5;
        Picture pic2 = new Picture(width, height);
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                double a = i - x0;
                double b = j - y0;
                double angle1 = (Math.PI / 256) * Math.abs(i - j);
                int ti = (int) (a * Math.cos(angle1) - b * Math.sin(angle1) + x0);
                int tj = (int) (a * Math.sin(angle1) + b * Math.cos(angle1) + y0);
                if (ti >= 0 && ti < width && tj >= 0 && tj < height) {
                    pic2.set(i, j, pic1.get(ti, tj));
                }
            }
        }
        pic2.show();
    }
}
