package package13;

public class HarmonicNumber {

	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}
		System.out.println("Result: " + sum);
	}

}
