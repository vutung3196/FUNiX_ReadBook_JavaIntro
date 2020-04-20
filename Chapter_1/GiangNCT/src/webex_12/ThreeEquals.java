package webex_12;

// 12. Reads in three parameters and prints true if all three are equal, and false otherwise.
public class ThreeEquals {

	public static void main(String[] args) {
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int third = Integer.valueOf(args[2]);
		System.out.println((first == second) && (second == third));
	}

}
