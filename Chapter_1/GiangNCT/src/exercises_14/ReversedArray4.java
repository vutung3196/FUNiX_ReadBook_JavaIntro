package exercises_14;

// 4. reverses the order of values in a one-dimensional string array. Do not create another array to hold the result.
public class ReversedArray4 {

  public static void main(String[] args) {
    int length = 5;
    String[] array = new String[length];
    // gen inputs
    for (int i = 0; i < length; i++) {
      array[i] = Double.toString(Math.random());
      System.out.printf("%5s ", array[i]);
    }
    System.out.println();
    // reverse
    for (int i = 0; i < length / 2; i++) {
      String tmp = array[length - i - 1];
      array[length - i - 1] = array[i];
      array[i] = tmp;
    }
    // display reversed
    for (String num : array) {
      System.out.printf("%5s ", num);
    }
  }

}
