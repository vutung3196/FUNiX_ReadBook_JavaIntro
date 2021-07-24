public class FunctionGraph {
    public static void plot(Function f, double a, double b, int n) {
        double[] y = new double[n + 1];
        double delta = (b - a) / n;
        for (int i = 0; i <= n; i++) {
            y[i] = f.evaluate(a + delta * i);
        }
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }


    public static void main(String[] args) {
        double a = -5.0;
        double b = 5.0;
        Function f = new GaussianPDF();
        plot(f, a, b, 50);
        Function fsq = new Square();
        plot(fsq, a, b, 50);
    }
}
