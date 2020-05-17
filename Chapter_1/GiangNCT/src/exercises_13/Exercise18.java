package exercises_13;

// For loop comparison
public class Exercise18 {

	public static void main(String[] args) {
		int n = 1500;
		double sum = 0.0;
		// Sum doesn't change
		for (int i = 1; i <= n; i++) {
			sum += 1 / (i * i);
		}
		System.out.println("Sum: " + sum);
		System.out.println("PI: " + Math.sqrt(6 * sum));
		System.out.println();
		// Sum changed
		sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i * i;
		}
		System.out.println("Sum: " + sum);
		System.out.println("PI: " + Math.sqrt(6 * sum));
		System.out.println();
		// Sum changed
		sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / (i * i);
		}
		System.out.println("Sum: " + sum);
		System.out.println("PI: " + Math.sqrt(6 * sum));
		System.out.println();
		// Sum changed
		sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += 1 / (1.0 * i * i);
		}
		System.out.println("Sum: " + sum);
		System.out.println("PI: " + Math.sqrt(6 * sum));
		System.out.println();
	}

}
