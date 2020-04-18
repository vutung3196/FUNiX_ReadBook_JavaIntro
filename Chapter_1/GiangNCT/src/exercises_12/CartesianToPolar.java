package exercises_12;

// 26. Converts from Cartesian to polar coordinates
public class CartesianToPolar {

	public static void main(String[] args) {
		double x = Double.valueOf(args[0]);
		double y = Double.valueOf(args[1]);
		double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		double theta = Math.atan2(y, x);
		System.out.println("r: " + r + ", theta: " + theta);

	}

}
