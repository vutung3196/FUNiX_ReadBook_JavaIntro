package package13;

public class PowersOfTwo {

	public static void main(String[] args) {
		// Read inputs
		int n = Integer.valueOf(args[0]);
		int i = 0;
		int powerOfTwo = 1;
		// repeat from 1 to n
		while (powerOfTwo <= n) {
			System.out.println(i + " " + powerOfTwo);
			powerOfTwo = 2 * powerOfTwo;
			i = i + 1;
		}
	}

}
