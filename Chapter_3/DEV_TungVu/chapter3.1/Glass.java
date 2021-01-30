import java.awt.*;

public class Glass {
    public static void main(String[] args) {
        // You can replace args[0] by mandrill.jpg
        Picture picture1 = new Picture(args[0]);
        picture1.show();
        int width = picture1.width();
        int height = picture1.height();
        Picture picture2 = new Picture(width, height);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int newX = x + random(-5, 5);
                int newY = y + random(-5, 5);
                if (newX >= 0 && newX < width && newY >= 0 && newY < height) {
                    picture2.set(x, y, picture1.get(newX, newY));
                }
            }
        }
        picture2.show();
    }

    public static int random(int a, int b) {
        return a + StdRandom.uniform(b-a+1);
    }
}
