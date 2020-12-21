package webex_14;

// Repeatedly roll a fair 6-sided die until the sum is strictly more than 12.
// Which is the most likely sum: 13, 14, 15, 16,  17, or 18?
public class MostLikelyRoll26 {

  public static void main(String[] args) {
    int SIDES = 6, TARGET = 12;
    int trials = Integer.valueOf(args[0]);
    int[] freq = new int[TARGET + SIDES + 1];
    
    for (int i = 1; i <= trials; i++) {
      int sum = 0;
      while (sum <= TARGET) {
        int die = 1 + (int) (Math.random() * SIDES);
        sum += die;
      }
      freq[sum]++;
    }
    
    for (int i = TARGET + 1; i <= TARGET + SIDES; i++) {
      double fraction = 1.0 * freq[i] / trials;
      System.out.println(i + ": " + fraction);
    }
  }

}
