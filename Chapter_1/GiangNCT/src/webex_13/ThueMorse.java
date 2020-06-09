package webex_13;

// 36. Prints the Thue-Morse sequence, which is defined as follows
//     Start with 0, and repeatedly flip all the bits and concatenate
//     it onto the original string.
public class ThueMorse {

  public static void main(String[] args) {
    // int n = Integer.valueOf(args[0]);
    int n = 5;
    String thue = "0", morse = "1";
    for (int i = 1; i <= n; i++) {
      String t = thue;
      String m = morse;
      thue += m;
      morse += t;
    }
    System.out.println(thue);
  }

}
