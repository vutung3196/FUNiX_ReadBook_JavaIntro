package package21;

public class Harmonic {

  static double harmonic (int n) {
    System.out.println("Harmonic");
    double sum = 0.0;
    for (int i = 1; i <= n; i++) {
      int j;
      sum += 1.0 / i;
    }
    return sum;
  }
  
  static void harmonic () {
    double sum = 0.0;
    for (int i = 1; i <= 10; i++) {
      int j;
      sum += 1.0 / i;
    }
    System.out.println(sum);
  }
  
  public static void main(String[] args) {
    int n = 10;
    harmonic();
  }

}
