package exercises_13;

// Prints the K-base representation of the decimal number typed as the command-line argument
public class Kary {

	public static void main(String[] args) {
		int base = Integer.valueOf(args[0]);
		int n = Integer.valueOf(args[1]);
		
		// Uncomment for quick test
		/*
		int base = 2;
		int n = 2546;
		*/
			
		int power = 1;
		while (power <= n / base) {
			power *= base;
		}
		
		while (power > 0) {
			// if the bit should be 0
			if (n < power) {
				System.out.print("0");
			} else {
				// if the bit should be something else
				int digit = n / power;
				if (digit > 9) {
					char cDigit = (char) ('A' + (digit - 10));
					System.out.print(cDigit);
				} else {
					System.out.print(digit);
				}
				n -= digit * power;
			}
			power /= base;
		}
	}

}
