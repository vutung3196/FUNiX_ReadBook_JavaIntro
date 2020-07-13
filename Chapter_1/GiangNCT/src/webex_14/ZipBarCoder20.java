package webex_14;

// 20. Reads in a 5 digit zip code and prints out the postal barcode.
public class ZipBarCoder20 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    int[] digits = new int[6];
    int[][] code = {{1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 1, 0, 1},
                    {0, 0, 1, 1, 0}, {0, 1, 0, 0, 1}, {0, 1, 0, 1, 0},
                    {0, 1, 1, 0, 0}, {1, 0, 0, 0, 1}, {1, 0, 0, 1, 0}, {1, 0, 1, 0, 0}
                   };
    for (int i = 1; i <= 5; i++) {
      digits[i] = n % 10;
      n /= 10;
    }
    
    int checkdigit = 0;
    for (int i = 1; i <= 5; i++) {
      checkdigit += digits[i];
    }
    digits[0] = checkdigit % 10;
    
    System.out.println("*****");
    for (int i = 5; i >= 0; i--) {
      for (int j = 0; i < 5; j++) {
        System.out.println((code[digits[i]][j] == 1) ? "*****" : "**");
      }
    }
    System.out.println("*****");
  }

}
