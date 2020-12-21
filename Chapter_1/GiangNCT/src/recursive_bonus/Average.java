package recursive_bonus;

import java.util.Arrays;

public class Average {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(avgLoop(arr));
    System.out.println(avgRecursion(arr, 0));
    System.out.println(betterRecursion(arr, arr.length));
  }
  
  static double avgLoop(int[] arr) {
    double sum = 0.0;
    for (int i = 0; i < arr.length; ++i) {
      sum += arr[i];
    }
    return sum / arr.length;
  }
  
  static double avgRecursion(int[] arr, int index) {
    if (index == arr.length - 1) {
      return (double) arr[index] / arr.length;
    }
    
    return ((double) arr[index] / arr.length) + avgRecursion(arr, index + 1);
  }
  
  static double betterRecursion(int[] arr, int length) {
    if (arr.length == 1) {
      return (double) arr[0] / length;
    }
    return ((double) arr[arr.length - 1] / length)
        + betterRecursion(Arrays.copyOf(arr, arr.length - 1), length);
  }
}
