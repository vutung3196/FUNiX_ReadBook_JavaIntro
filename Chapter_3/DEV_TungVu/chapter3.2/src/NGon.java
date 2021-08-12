public class NGon {
    public static void main(String[] args) {
        int n = 999;
        double angle = 360.0 / n;
        double step  = Math.sin(Math.toRadians(angle/2.0));   // sin(pi/n)
        Turtle turtle = new Turtle(0.5, 0.0, angle / 2.0);
        for (int i = 0; i < n; i++) {
            turtle.goForward(step);
            turtle.turnLeft(angle);
        }
    }
}
