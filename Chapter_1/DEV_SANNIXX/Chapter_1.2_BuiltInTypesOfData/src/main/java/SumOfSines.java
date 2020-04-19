public class SumOfSines {

    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double radians = Math.toRadians(t);
        double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.printf("sin(2*%f) + sin(3*%f) = %f", radians, radians, sum);
    }

}
