package webex_12;

// 22. Takes two command-line arguments, weight and height, and prints the BMI.
public class BMI {

	public static void main(String[] args) {
		int mass = Integer.valueOf(args[0]);
		double height = Double.valueOf(args[1]);
		System.out.println(mass / Math.pow(height, 2));
	}

}
