package webex_13;

// 34. takes an integer N as a command-line argument and print N standard normal random variables,
// and their average value, and sample standard deviation.
public class StandardDeviation {

  public static void main(String[] args) {
    // int N = Integer.valueOf(args[0]);
    int N = 10;
    double[] arr = new double[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Math.random();
    }
    double sum = 0.0;
    for (double num : arr) {
      sum += num;
    }
    double avg = sum / arr.length;
    double std = 0.0;
    for (double num : arr) {
      std += Math.pow(num - avg, 2);
    }
    std /= N;
    std = Math.sqrt(std);
    System.out.print("Array: ");
    for (double num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
    
    System.out.println("Average: " + avg);
    System.out.println("Standard deviation: " + std);
  }

}
