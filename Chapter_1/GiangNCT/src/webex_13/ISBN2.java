package webex_13;

// 45. reads in a 9 digit integer from a command-line argument,
// computes the check digit, and prints the fully formatted ISBN number
public class ISBN2 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    String isbn = "";
    int sum = 0;
    for (int i = 2; i <= 10; i++) {
      int digit = n % 10;
      if (i == 2 || i == 7 || i == 10) isbn = "-" + isbn;
      isbn = digit + isbn;
      sum += digit * i;
      n /= 10;
    }
    
    if (sum % 11 == 1) isbn += "X";
    else if (sum % 11 == 0) isbn += "0";
    else isbn += (11 - sum % 11);
    System.out.println(isbn);
  }

}
