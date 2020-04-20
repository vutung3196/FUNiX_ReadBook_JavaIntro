package package12;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b = Double.parseDouble(args[0]);
		double c = Double.parseDouble(args[1]);
		
		double discriminant = b * b - 4.0 * c;
		double sqroot = Math.sqrt(discriminant);
		//System.out.println(discriminant);
		
		double root1 = (-b + sqroot) / 2;
		double root2 = (-b - sqroot) / 2;
		
		System.out.println(root1);
		System.out.println(root2);
	}

}
