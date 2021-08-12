public class DrunkenTurtles {
    public static void main(String[] args) {
        int n = 2;
        int trials = 10000;
        double step = 0.05;
        Turtle[] turtles = new Turtle[n];
        for (int i = 0; i < n; i++) {
            double x = StdRandom.uniform(0.0, 1.0);
            double y = StdRandom.uniform(0.0, 1.0);
            turtles[i] = new Turtle(x, y, 0.0);
        }
        for (int i = 0; i < trials; i++) {
            for (int j = 0; j < n; j++) {
                double randomDouble = StdRandom.uniform(0.0, 360.0);
                turtles[i].turnLeft(randomDouble);
                turtles[i].goForward(step);
            }
        }
    }
}
