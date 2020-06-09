package webex_13;

// 64. reads in three integers a, b, and c from the command line and prints them out in ascending order.
public class Sort3 {

  public static void main(String[] args) {
    /* Read from command line
    int a = Integer.valueOf(args[0]);
    int b = Integer.valueOf(args[1]);
    int c = Integer.valueOf(args[2]);
    */
    int a = 8, b = 5, c = 10;
    if (b < a) {
      int temp = b;
      b = a;
      a = temp;
    }
    if (c < b) {
      int temp = b;
      b = c;
      c = temp;
    }
    if (b < a) {
      int temp = b;
      b = a;
      a = temp;
    }
    System.out.println(a + ", " + b + ", " + c);
  }

}