package exercises_14;

// 26. reads in a permutation of the integers 0 to n-1 from n command-line arguments and prints the inverse permutation.
// (If the permutation is in an array a[], its inverse is the array b[] such that a[b[i]] = b[a[i]] = i.)
public class InversePermutation26 {

  public static void main(String[] args) {
    int length = args.length;
    
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      array[i] = Integer.valueOf(args[i]);
    }
    
    boolean[] exists = new boolean[length];
    for (int element : array) {
      if (element < 0 || element >= length || exists[element]) {
        throw new RuntimeException("Not a permutation");
      }
      exists[element] = true;
    }
    
    int[] ainv = new int[length];
    for (int i = 0; i < length; i++) {
      ainv[array[i]] = i;
    }
    
    // display
    for (int element : ainv) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

}
