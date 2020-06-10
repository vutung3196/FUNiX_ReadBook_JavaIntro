package exercises_13;

// 38. Computes e^x using the Taylor series expansion
public class Exp {

	public static void main(String[] args) {
		//double x = Double.valueOf(args[0]);
		double x = 10.0;
		System.out.println(Math.exp(x));
		
		boolean isNeg = x < 0;
		// Remove negative
		x = isNeg ? -x : x;
		
		// Computing
		double element = 1.0;
		double sum = 0.0;
		for(int i = 1; sum != sum + element; i++) {
			sum += element;
			element *= x / i;
		}
		
		// print
		sum = isNeg ? 1/sum : sum;
		System.out.println(sum);
	}

}
