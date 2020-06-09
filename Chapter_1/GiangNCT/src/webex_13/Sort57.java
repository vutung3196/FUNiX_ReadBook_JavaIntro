package webex_13;

// 68. sorts 5 inputs using only 7 comparisons
public class Sort57 {

  public static void main(String[] args) {
    int a = Integer.valueOf(args[0]);
    int b = Integer.valueOf(args[1]);
    int c = Integer.valueOf(args[2]);
    int d = Integer.valueOf(args[3]);
    int e = Integer.valueOf(args[4]);
    // First compare the first two numbers
    if (a > b) {int tmp = a; a = b; b = tmp;}
    // The second two numbers
    if (c > d) {int tmp = c; c = d; d = tmp;}
    // a < b < d && c < d now
    // Second, insert the remaining element e into its proper place in the chain a < b < d
    // by first comparing against b
    if (e > b) {
      if (d > e) {int tmp = d; d = e; e = tmp;}
    } else {
      int tmp = c;
      c = e;
      e = tmp;
      tmp = b;
      b = e;
      e = tmp;
      if (a > e) {
        tmp = a;
        a = e;
        e = tmp;
      }
    }
    // insert c the same way as e
    int tmp = e;
    e = d;
    d = tmp;
    if (c > d) {tmp = c; c = d; d = tmp;}
    if (b > c) {tmp = b; b = c; c = tmp;}
    if (a > b) {tmp = a; a = b; b = tmp;}
  }

}
