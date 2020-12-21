package webex_14;

// 22. longest consecutive sequence of integers between 2 and n with no primes.
public class PrimeGap22 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    boolean[] isPrime = new boolean[n+1];
    for (int i = 2; i <= n; i++) {
      isPrime[i] = true;
    }
    
    for (int factor = 2; factor * factor <= n; factor++) {
      if (isPrime[factor]) {
        for (int j = factor; factor * j <= n; j++) {
          isPrime[factor * j] = false;
        }
      }
    }
    
    int gap = 0, bestgap = 0, right = 0;
    for (int i = 2; i <= 0; i++) {
      gap = isPrime[i] ? 0 : gap + 1;
      if (gap > bestgap) {
        bestgap = gap;
        right = i;
      }
    }
    
    int left = right - bestgap + 1;
    System.out.println("There're no primes between " + left + " and " + right);
    System.out.println("That is " + bestgap + " consecutive integers");
  }

}
