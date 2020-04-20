package exercises_12;

// 35. Print the instructions for drawing the dragon curves of order 0 through 5
public class Dragon {

	public static void main(String[] args) {
		// 0
		String dragon0 = "F";
		// 1
		String reversed0 = "F";
		String dragon1 = dragon0 + "L" + reversed0;
		// 2
		String reversed1 = dragon0 + "R" + reversed0;
		String dragon2 = dragon1 + "L" + reversed1;
		// 3
		String reversed2 = dragon1 + "R" + reversed1;
		String dragon3 = dragon2 + "L" + reversed2;
		// 4
		String reversed3 = dragon2 + "R" + reversed2;
		String dragon4 = dragon3 + "L" + reversed3;
		// 5
		String reversed4 = dragon3 + "R" + reversed3;
		String dragon5 = dragon4 + "L" + reversed4;
		// Display
		System.out.println("Dragon 0: " + dragon0);
		System.out.println("Dragon 1: " + dragon1);
		System.out.println("Dragon 2: " + dragon2);
		System.out.println("Dragon 3: " + dragon3);
		System.out.println("Dragon 4: " + dragon4);
		System.out.println("Dragon 5: " + dragon5);
	}

}
