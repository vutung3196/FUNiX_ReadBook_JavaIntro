package package21;

public class Coupon {

  public static void main(String[] args) {
    int n = 1000;
    // return n turns
    int count = collect(n * 2);
    System.out.println(count);
  }
  
  public static int collect(int n) {
    int count = 0, distinct = 0;
    boolean[] isCollected = new boolean[n];
    
    while (distinct < n) {
      // return a random value from 0 to n - 1
      int value = getCoupon(n);
      count++;
      if (!isCollected[value]) {
        distinct++;
        isCollected[value] = true;
      }
    }
    return count;
  }

  // return random value
  public static int getCoupon(int n) {
    return (int) (Math.random() * n);
  }

  
}
