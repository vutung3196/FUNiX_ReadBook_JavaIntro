package package13;

public class ArrayExamples {

	public static void main(String[] args) {
		//int n = Integer.valueOf(args[0]);
		int n = 5;
		// TODO Auto-generated method stub
		double[] a = new double[n];
		// Initialize to random values between 0 and 1
		for (int i = 0; i < n; i++) {
			a[i] = Math.random();
		}
		// print array values, one per line
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// find the max
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Max: " + max);
		// average
		double avg = 0.0;
		for (int i = 0; i < n; i++) {
			avg += a[i];
		}
		avg /= n;
		System.out.println("Average: " + avg);
		// copy to array b
		double[] b = new double[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		// reverse the order of b
		for (int i = 0; i < n/2; i++) {
			double tmp = b[i];
			b[i] = b[n - 1 - i];
			b[n - 1 - i] = tmp;
		}
		// print b
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		// dot product of a and b
		double dot = 0.0;
		for (int i = 0; i < n; i++) {
			dot += a[i] * b[i];
		}
		System.out.println("Dot: " + dot);
	}

}
