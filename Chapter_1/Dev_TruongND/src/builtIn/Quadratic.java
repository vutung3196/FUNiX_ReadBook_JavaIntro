package builtIn;

public class Quadratic {

	public static void main(String[] args) {
		
		double b = Double.parseDouble(args[0]);
		double c = Double.parseDouble(args[1]);
		
		double discriminat = b * b - 4.0 * c;
		double sqrtdis = Math.sqrt(discriminat);
		
		double root1 = (-b + sqrtdis) / 2.0;
		double root2 = (-b - sqrtdis) / 2.0;
		
		System.out.println(root1);
		System.out.println(root2);

	}

}
