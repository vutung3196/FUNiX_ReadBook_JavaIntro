package webex_13;

// 17. Write a program using a loop and four conditionals to print
// 12 midnight
// 1am
// 2am
// ...
// 12 noon
// 1pm
// ...
// 11pm
public class Print17 {

	public static void main(String[] args) {
		for (int i = 0; i < 24; i++) {
			if (i == 0) System.out.println("12 midnight");
			else if (i < 12) System.out.println(i % 12 + "am");
			else if (i == 12) System.out.println("12 noon");
			else System.out.println(i % 12 + "pm");
		}
	}

}
