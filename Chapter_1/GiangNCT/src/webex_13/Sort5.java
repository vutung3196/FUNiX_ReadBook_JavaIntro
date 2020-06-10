package webex_13;

// 66. sorts 5 elements using 9 compare-exchanges.
public class Sort5 {

  public static void main(String[] args) {
    int A = Integer.valueOf(args[0]);
    int B = Integer.valueOf(args[1]);
    int C = Integer.valueOf(args[2]);
    int D = Integer.valueOf(args[3]);
    int E = Integer.valueOf(args[4]);
    
    if (A > B) {
      int tmp = A;
      A = B;
      B = tmp;
    }
    
    if (D > E) {
      int tmp = D;
      D = E;
      E = tmp;
    }
    
    if (A > C) {
      int tmp = A;
      A = C;
      C = tmp;
    }
    
    if (B > C) {
      int tmp = C;
      C = B;
      B = tmp;
    }
    
    if (A > D) {
      int tmp = A;
      A = D;
      D = tmp;
    }
    
    if (C > D) {
      int tmp = C;
      C = D;
      D = tmp;
    }
    
    if (B > E) {
      int tmp = B;
      B = E;
      E = tmp;
    }
    
    if (B > C) {
      int tmp = B;
      B = C;
      C = tmp;
    }
    
    if (D > E) {
      int tmp = D;
      D = E;
      E = tmp;
    }
    
    System.out.println(A + ", " + B + ", " + C + ", " + D + ", " + E);
  }
}
