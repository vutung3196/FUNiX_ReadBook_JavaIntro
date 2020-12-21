import java.awt.*;

public class FlipX {
    public static void main(String[] args) {
        // Flipping
        Picture picture = new Picture(args[0]);
        int width = picture.width();
        int height = picture.height();
        // current picture
        picture.show();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width / 2; x++) {
                Color c1 = picture.get(x, y);
                Color c2 = picture.get(width - x -1, y);
                // Set color (x, y) equal to c2
                picture.set(x, y, c2);
                //  Set color (width - x - 1, y) equal to c1
                picture.set(width - x - 1, y, c1);
            }
        }
        picture.show();
    }
}
