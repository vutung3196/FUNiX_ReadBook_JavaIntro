package three;

public class ISBN2 {
	//Write a program ISBN2.java that reads in a 9 digit integer from a command-line argument,
	//computes the check digit, and prints the fully formatted ISBN number, e.g, 0-201-31452-5.
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
        String isbn = "";

        int sum = 0;
        for (int i = 2; i <= 10; i++) {
            int digit = n % 10;
            if (i == 2 || i == 7 || i == 10) {
            	isbn = "-" + isbn;
            }
            isbn = digit + isbn;
            sum += i * digit;
            n = n / 10;
        }
     

        if (sum % 11 == 1)      {
        	isbn += "X";
        
        }
        else if (sum % 11 == 0) {
        	isbn += "0";
        }
        else                    {
        	isbn += (11 - sum % 11);
        }

        System.out.println(isbn);
	}

}
