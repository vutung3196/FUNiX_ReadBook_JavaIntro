package webex_13;

// 66. Sort 4 numbers using 5 compare-exchanges
public class Sort4 {

  public static void main(String[] args) {
    int a = Integer.valueOf(args[0]);
    int b = Integer.valueOf(args[1]);
    int c = Integer.valueOf(args[2]);
    int d = Integer.valueOf(args[3]);
    if (a > b) {
      int tmp = b;
      b = c;
      c = tmp;
    }
    if (c > d) {
      int tmp = c;
      c = d;
      d = tmp;
    }
    if (a > c) {
      int tmp = c;
      c = a;
      a = tmp;
    }
    if (b > d) {
      int tmp = b;
      b = d;
      d = tmp;
    }
    if (b > c) {
      int tmp = c;
      c = b;
      b = tmp;
    }
    System.out.println(a + ", " + b + ", " + c + ", " + d);
  }
}
