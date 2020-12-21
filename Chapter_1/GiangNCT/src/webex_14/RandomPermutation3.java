package webex_14;

// 3. Prints a pseudorandom permution of the integers 0 through n-1.
public class RandomPermutation3 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    int[] a = new int[n];
    
    for (int i = 0; i < n; i++) {
      a[i] = i;
    }
    
    // shuffle
    for (int i = 0; i < n; i++) {
      int random = (int) (Math.random() * (i + 1));
      int tmp = a[random];
      a[random] = a[i];
      a[i] = tmp;
    }
    
    // print permutation
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
    
    // display checkboard vertically
    for (int i = 0; i < n; i++) {
      for (int num : a) {
        System.out.print(num == i ? "Q " : "* ");
      }
      System.out.println();
    }
  }
}
