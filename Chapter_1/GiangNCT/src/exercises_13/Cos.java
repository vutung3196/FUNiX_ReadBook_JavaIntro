package exercises_13;

// 39. Compute cos x using the Taylor series expansions
public class Cos {

	public static void main(String[] args) {
		//double x = Double.valueOf(args[0]);
		double x = 0.523598775598299;
		x = x % (2 * Math.PI);
		
		double element = x;
		double sum = 1.0;
		
		for (int i = 2; element != 0.0; i++) {
			element *= (x / i);
			if (i % 4 == 2) sum -= element;
			if (i % 4 == 0) sum += element;
		}
		System.out.println(sum);
	}

}
