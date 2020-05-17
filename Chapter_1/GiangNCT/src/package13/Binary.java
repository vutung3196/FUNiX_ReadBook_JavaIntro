package package13;

// Prints the binary (base 2) representation of the decimal number typed as the command-line argument
public class Binary {

	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		
		int power = 1;
		while (power <= n / 2) {
			power *= 2;
		}
		
		// while power = 1 => power /= 2 == 0
		while (power > 0) {
			// No presents
			if (n < power) {
				System.out.print("0");
			// presents
			} else {
				System.out.print("1");
				n -= power;
			}
			power /= 2;
		}
	}

}
