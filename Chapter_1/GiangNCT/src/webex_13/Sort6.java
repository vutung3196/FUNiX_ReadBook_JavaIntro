package webex_13;

// 67. sorts 6 elements using 12 compare-exchanges.
public class Sort6 {

  public static void main(String[] args) {
    int a = Integer.valueOf(args[0]);
    int b = Integer.valueOf(args[1]);
    int c = Integer.valueOf(args[2]);
    int d = Integer.valueOf(args[3]);
    int e = Integer.valueOf(args[4]);
    int f = Integer.valueOf(args[5]);
    String sep = ", ";
    
    if (a > b) {int tmp = b; b = a; a = tmp;}
    if (c > d) {int tmp = d; d = c; c = tmp;}
    if (e > f) {int tmp = f; f = e; e = tmp;}
    if (c > e) {int tmp = e; e = c; c = tmp;}
    if (a > c) {int tmp = c; c = a; a = tmp;}
    if (b > d) {int tmp = b; b = d; d = tmp;}
    if (d > f) {int tmp = f; f = d; d = tmp;}
    if (b > c) {int tmp = b; b = c; c = tmp;}
    if (d > e) {int tmp = d; d = e; e = tmp;}
    if (b > d) {int tmp = b; b = d; d = tmp;}
    if (c > e) {int tmp = c; c = e; e = tmp;}
    if (c > d) {int tmp = c; c = d; d = tmp;}
    System.out.println(a + sep + b + sep + c + sep + d + sep + e + sep + f);
  }

}
