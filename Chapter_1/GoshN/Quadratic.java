
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        
        double discriminant = b*b - 4*a*c;
        double sqroot =  Math.sqrt(discriminant);

        double x1 = (-b + sqroot) / 2;
        double x2 = (-b - sqroot) / 2;

        System.out.println(x1);
        System.out.println(x2);
	}

}
