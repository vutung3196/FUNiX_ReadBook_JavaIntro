public class Spiral {
    public static void main(String[] args) {
        int n = 30;
        double decay = 1.02;
        double angle = 360 / n;
        double step = Math.sin(Math.toRadians(angle / 2.0));
        Turtle turtle = new Turtle(0.5, 0.0, angle / 2.0);
        for (int i = 0; i < 10 * n; i++) {
            step /= decay;
            turtle.goForward(step);
            turtle.turnLeft(angle);
        }
    }
}
