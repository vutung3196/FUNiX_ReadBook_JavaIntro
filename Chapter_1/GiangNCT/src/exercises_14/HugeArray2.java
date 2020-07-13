package exercises_14;


// 2. Java OutOfMemory && Java NegativeArraySizeException
public class HugeArray2 {

  public static void main(String[] args) {
    int n = 1000;
    // java.lang.NegativeArraySizeException
    //int[] a = new int[n * n * n * n];
    // No errors
    n = 2000000;
    int[] a = new int[n];
    System.out.println(a.length);
  }

}
