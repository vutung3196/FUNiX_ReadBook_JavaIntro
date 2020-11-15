package package21;

public class CouponCollector {

  public static void main(String[] args) {
    int n = 10000000;
    boolean[] isCollected = new boolean[n];
    int count = 0, distinct = 0;
    
    while (distinct < n) {
      int value = (int) (Math.random() * n);
      count++;
      if (!isCollected[value]) {
        distinct++;
        isCollected[value] = true;
      }
    }
    
    System.out.println(count);
  }

}
