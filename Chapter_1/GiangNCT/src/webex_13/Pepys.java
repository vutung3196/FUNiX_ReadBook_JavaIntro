package webex_13;

// 76. getting at least one 1 when rolling a fair die 6 times or getting at least two 1's when rolling a fair die 12 times
// uses simulation to determine the correct answer.
public class Pepys {

  public static void main(String[] args) {
    int SIDES = 6;
    int k = Integer.valueOf(args[0]);
    int trials = Integer.valueOf(args[1]);
    
    int count = 0;
    for (int i = 0; i < trials; i++) {
      int ones = 0;
      for (int j = 0; j < k * SIDES; j++) {
        double r = Math.random();
        if (r < 1.0 / SIDES) {
          ones++;
        }
      }
      if (ones >= k) count++;
    }
    System.out.println(1.0 * count / trials);
  }

}
