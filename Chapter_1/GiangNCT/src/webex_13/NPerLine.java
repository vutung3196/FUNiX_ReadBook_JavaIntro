package webex_13;

// 39. Write a program NPerLine.java that takes an integer command-line argument n 
// and prints the integers from 10 to 99 with n integers per line.
// 40. Modify NPerLine.java so that it prints the integers from 1 to 1000 with n integers per line
public class NPerLine {

  public static void main(String[] args) {
    //int n = Integer.valueOf(args[0]);
    int n = 10;
    // 10 - 99
    // int low = 10, high = 100;
    // 1 to 1001
    int low = 1, high = 1001;
    for (int i = low; i < high; i++) {
      System.out.print(i);
      if (i == high - 1) System.out.print(".");
      else if ((i - low) % n == n -1) System.out.println();
      else System.out.print(", ");
    }
  }

  
  

}
