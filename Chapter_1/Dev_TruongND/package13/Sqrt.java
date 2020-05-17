package package13;

public class Sqrt {

	public static void main(String[] args) {
		
		double x = Integer.parseInt(args[0]);
		//assign eps and t values
		double eps = 1.0e-15;
		double t = x;
		
		//if t not equal x/t then assign t = average values
		while(Math.abs(t - x/t) > eps*t) {
			t = (t + x/t)/2.0;
		}
		
		//print the estimate values
		System.out.println(t);
		
	}

}
