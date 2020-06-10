package exercises_13;

// 39. compute sin x using the Taylor series expansions
public class Sin {

	public static void main(String[] args) {
		//double x = Double.valueOf(args[0]);
		double x = 0.523598775598299;
		// normalize to [-2*pi, 2 * pi]
		x = x % (2 * Math.PI);
		
		// compute Taylor series
		double element = 1.0;
		double sum = 0.0;
		
		for (int i = 1; element != 0.0; i++) {
			element *= (x / i);
			if (i % 4 == 1) sum += element;
			if (i % 4 == 3) sum -= element;
		}
		System.out.println(sum);
	}

}
