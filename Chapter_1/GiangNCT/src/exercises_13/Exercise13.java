package exercises_13;

// Value of m & n
public class Exercise13 {

	public static void main(String[] args) {
		int n = 123456789;
		int m = 0;
		while (n != 0) {
			m = (10 * m) + (n % 10);
			n /= 10;
		}
		System.out.println("n: " + n + ", m: " + m);

	}

}
