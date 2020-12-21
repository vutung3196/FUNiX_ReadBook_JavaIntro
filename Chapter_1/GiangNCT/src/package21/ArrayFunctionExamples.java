package package21;

public class ArrayFunctionExamples {

  public static void main(String[] args) {
    double[] array = {4.0, 2.1, 7.2, 5.3, 3.4, 8.5, 10.6};
    display(array);
    //swap(array, 8, 9);
    shuffle(array);
    display(array);
    System.out.println(dot(array, array));
  }
  
  public static void display(double[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%-8.2f", a[i]);
    }
    System.out.println();
  }
  
  public static double mean(double[] array) {
    double sum = 0.0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum / array.length;
  }
  
  public static void swap(double[] a, int i, int j) {
    double tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }
  
  public static int uniform(int n) {
    return (int) (Math.random() * n);
  }
  
  public static void shuffle(double[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int r = uniform(n - 1);
      swap(array, i, r);
    }
  }
  
  public static double dot(double[] a, double[] b) {
    double sum = 0.0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i] * b[i];
    }
    return sum;
  }
  
  public static double[] tone(double hz, double duration) {
    int SAMPLING_RATE = 44100;
    int n = (int) (SAMPLING_RATE * duration);
    double[] a = new double[n+1];
    for (int i = 0; i <= n; i++) {
      a[i] = Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE);
    }
    return a;
  }
}
