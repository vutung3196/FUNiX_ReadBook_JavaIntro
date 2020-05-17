package exercises_13;

// 35. Takes a 9-digit integer as a command-line argument, computes the checksum, and prints the 10-digit ISBN number
// d1 + 2d2 + 3d3 + ... + 10d10 must be a multiple of 11
public class Checksum {

	public static void main(String[] args) {
		//int num = Integer.valueOf(args[0]);
		int num = 20131452;
		int sum = 0;
		int result = num;
		for (int i = 2; i < 11; i++) {
			int digit = num % 10;
			sum += i * digit;
			num /= 10;
		}
		System.out.print(result);
		System.out.println(result % 11 == 1 ? "X" : (11 - sum % 11));
	}

}
