public class Wave {
    public static void main(String[] args) {
        // You can replace args[0] by mandrill.jpg
        Picture picture1 = new Picture(args[0]);
        picture1.show();
        int width = picture1.width();
        int height = picture1.height();
        Picture picture2 = new Picture(width, height);
        for (int si = 0; si < width; si++) {
            for (int sj = 0; sj < height; sj++) {
                int ti = si;
                int tj = (int) (sj + 20*Math.sin(2*Math.PI*sj / 64));
                if (ti >= 0 && ti < width && tj >= 0 && tj < height) {
                    picture2.set(si, sj, picture1.get(ti, tj));
                }
            }
        }
        picture2.show();
    }
}
