package exercises_13;

// 1. Takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise.
public class AllEqual {

	public static void main(String[] args) {
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int third = Integer.valueOf(args[2]);
		if (first == second && second == third) System.out.println("equal");
		else System.out.println("not equal");
	}

}
