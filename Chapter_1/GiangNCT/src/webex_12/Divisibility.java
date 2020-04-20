package webex_12;

// 19. Reads in two command line inputs and prints true if both are divisible by 7, and false otherwise.
public class Divisibility {

	public static void main(String[] args) {
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		System.out.println(first % 7 == 0 && second % 7 == 0);
	}

}
