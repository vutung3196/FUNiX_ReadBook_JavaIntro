package webex_12;

// 8. see what happens when you divide an int or double by zero
public class DivideByZero {

	public static void main(String[] args) {
		// There will be exception in the 2 lines below
		// System.out.println("1 / 0 = " + 1 / 0);
		// System.out.println("1 % 0 = " + 1 % 0);
		System.out.println("1.0 / 0.0 = " + 1.0 / 0.0); // Inf
		System.out.println("1.0 % 0.0 = " + 1.0 % 0.0); // NaN
	}

}
