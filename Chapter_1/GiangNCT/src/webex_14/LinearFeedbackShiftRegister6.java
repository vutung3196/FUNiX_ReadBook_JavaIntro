package webex_14;

// 6. Simulate a LFSR for n steps and print results.
public class LinearFeedbackShiftRegister6 {

  public static void main(String[] args) {
    boolean[] array = {false, true, false, false, false, false, true, false, true, true, false};
    // int trials = Integer.valueOf(args[0]);
    int trials = 10;
    int n = array.length;
    int TAP = 8;
    
    // shift register
    for (int i = 0; i < trials; i++) {
      boolean next = (array[n - 1] ^ array[TAP]);
      
      for (int j = n - 1; j > 0; j--) {
        array[j] = array[j - 1];
      }
      
      array[0] = next;
      
      System.out.print(next ? "1" : "0");
    }
  }

}
