package package13;

public class Sqrt {

	public static void main(String[] args) {
		double x = Integer.valueOf(args[0]);
		
		double eps = 10e-15;
		double t = x;
		
		while (Math.abs(t - x/t) > eps * t) {
			t = (t + x/t) / 2.0;
		}
		System.out.println("Result: " + t);
	}

}
