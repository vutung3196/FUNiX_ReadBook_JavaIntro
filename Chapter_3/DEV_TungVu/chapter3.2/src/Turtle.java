//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;

public class Turtle {
    private double x;
    private double y;
    private double angle;

    public Turtle(double x0, double y0, double a0) {
        this.x = x0;
        this.y = y0;
        this.angle = a0;
    }

    public void turnLeft(double delta) {
        this.angle += delta;
    }

    public void goForward(double step) {
        double oldX = this.x;
        double oldY = this.y;
        this.x += step * Math.cos(Math.toRadians(this.angle));
        this.y += step * Math.sin(Math.toRadians(this.angle));
        StdDraw.line(oldX, oldY, this.x, this.y);
    }

    public void show() {
        StdDraw.show();
    }

    public void pause(int t) {
        StdDraw.pause(t);
    }

    public void setPenColor(Color color) {
        StdDraw.setPenColor(color);
    }

    public void setCanvasSize(int width, int height) {
        StdDraw.setCanvasSize(width, height);
    }

    public void setXScale(double min, double max) {
        StdDraw.setXscale(min, max);
    }

    public void setYScale(double min, double max) {
        StdDraw.setYscale(min, max);
    }

    public void setPenRadius(double radius) {
        StdDraw.setPenRadius(radius);
    }

    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        double x0 = 0.5D;
        double y0 = 0.0D;
        double a0 = 60.0D;
        double step = Math.sqrt(3.0D) / 2.0D;
        Turtle turtle = new Turtle(x0, y0, a0);
        turtle.goForward(step);
        turtle.turnLeft(120.0D);
        turtle.goForward(step);
        turtle.turnLeft(120.0D);
        turtle.goForward(step);
        turtle.turnLeft(120.0D);
        turtle.show();
    }
}
