package webex_12;

// 18. Reads in three integer command line arguments, x, y, and z. Create a boolean variable b 
// that is true if the three values are either in ascending or in descending order, and false otherwise.
// Print the variable b.
public class Ordered {

	public static void main(String[] args) {
		int x = Integer.valueOf(args[0]);
		int y = Integer.valueOf(args[1]);
		int z = Integer.valueOf(args[2]);
		boolean b = ((x <= y) && (y <= z)) || ((x >= y) && (y >= z));
		System.out.println(b);
	}

}
