package webex_12;

// 1. Takes two integer command-line arguments a and b and swaps their values using the swapping idiom
public class Swap {

	public static void main(String[] args) {
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		System.out.println("first: " + first + ", second: " + second);
		int temp = first;
		first = second;
		second = temp;
		System.out.println("first: " + first + ", second: " + second);

	}

}
