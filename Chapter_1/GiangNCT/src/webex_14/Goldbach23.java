package webex_14;

// 23. Computes all primes less than n and tries to express n as a sum of two primes.
public class Goldbach23 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    
    boolean[] isPrime = new boolean[n];
    
    for (int i = 2; i < n; i++) {
      isPrime[i] = true;
    }
    
    for (int factor = 2; factor * factor < n; factor++) {
      if (isPrime[factor]) {
        for (int j = factor; factor * j < n; j++) {
          isPrime[factor*j] = false;
        }
      }
    }
    
    int primes = 0;
    for (int i = 2; i < n; i++) {
      primes += isPrime[i] ? 1 : 0; 
    }
    
    System.out.println("Done");
    
    int[] list = new int[primes];
    int count = 0;
    for (int i = 0;i  < n; i++) {
      if (isPrime[i]) list[count++] = i;
    }
    
    int left = 0, right = count - 1;
    while (left <= right) {
      if (list[left] + list[right] == n) break;
      else if (list[left] + list[right] < n) left++;
      else right--;
    }

    if (list[left] + list[right] == n) {
      System.out.println(n + " = " + list[left] + " + " + list[right]);
    } else {
      System.out.println(n + " not expressible as sum of two primes");
    }
  }

}
