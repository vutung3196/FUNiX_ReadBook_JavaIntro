public class RectangleRule {
    /**********************************************************************
     * Integrate f from a to b using the rectangled rule.
     * Increase n for more precision.
     **********************************************************************/
    public static double integrate(Function f, double a, double b, int n) {
        double delta = (b - a) / n;           // step size
        double sum = 0.0;                     // area
        for (int i = 0; i < n; i++) {
            sum += delta * f.evaluate(a + delta*(i + 0.5));
        }
        return sum;
    }

    // sample client program
    public static void main(String[] args) {
        double a = -3;
        double b = 3;
        Function f = new GaussianPDF();
        StdOut.println(integrate(x -> x*x, 0, 10, 1000));
    }

}