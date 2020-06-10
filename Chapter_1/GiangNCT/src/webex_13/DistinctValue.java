package webex_13;

//2. takes three integer command-line arguments a, b, and c
//and print the number of distinct values (1, 2, or 3) among a, b, and c.
public class DistinctValue {

	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		
		if (a != b && a != c) {
			System.out.print(a + " ");
		}
		
		if (b != c && b != a) {
			System.out.print(b + " ");
		}
		
		if (c != a && c != b) {
			System.out.println(c + " ");
		}
	}

}
