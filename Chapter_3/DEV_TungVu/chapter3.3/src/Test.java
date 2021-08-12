public class Test {
    public static void main(String[] args) {
        Function f1 = new Square();
        Function f2 = new GaussianPDF();
        System.out.println(f1.evaluate(1.2));
        System.out.println(f2.evaluate(1.2));
    }
}
