package exercises_13;

// 8. Takes the number of lines to print as a command-line argument. You may assume that the argument is less than 1000.
public class Hellos {

	public static void main(String[] args) {
		int times = Integer.valueOf(args[0]);
		for (int i = 1; i <= times; i++) {
			System.out.print(i);
			if(i % 100 > 10 && i % 100 <20) {
				System.out.print("th");
			} else if (i % 10 == 1) {
				System.out.print("st");
			} else if (i % 10 == 2) {
				System.out.print("nd");
			} else if (i % 10 == 3) {
				System.out.print("rd");
			} else {
				System.out.print("th");
			}
			System.out.println(" Hello");
		}
	}

}
