package webex_12;

// 27. write an expression to compute the discriminant b^2c^2 - 4c^3 - 4b^3d - 27d^2 + 18bcd.
public class DiscriminantCubic {

	public static void main(String[] args) {
		double b = Double.valueOf(args[0]);
		double c = Double.valueOf(args[1]);
		double d = Double.valueOf(args[2]);
		double discriminant = Math.pow(b, 2) * Math.pow(c, 2) - 4 * Math.pow(c, 3)
							- 4 * Math.pow(b, 3) * d - 27 * Math.pow(d, 2) + 18 * b * c * d;
		System.out.println("Discriminant: " + discriminant);
	}

}
