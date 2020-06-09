package webex_13;

// 37. Write 1 if n is odd, 0 if n is even. Divide n by 2, throwing away the remainder. 
// Repeat until n = 0 and read the answer backwards.
public class Binary2 {

  public static void main(String[] args) {
    // int number = Integer.valueOf(args[0]);
    int number = 15837;
    int bitNum = 0;
    int tmp = number;
    // Get number of bits
    while (tmp > 0) {
      bitNum++;
      tmp /= 2;
    }
    // Save bits
    int[] bits = new int[bitNum];
    tmp = number;
    for (int i = bitNum - 1; i >= 0; i--) {
      bits[i] = tmp % 2;
      tmp /= 2;
    }
    // Display result
    System.out.print(number + " = ");
    for (int bit : bits) {
      System.out.print(bit);
    }
  }

}
