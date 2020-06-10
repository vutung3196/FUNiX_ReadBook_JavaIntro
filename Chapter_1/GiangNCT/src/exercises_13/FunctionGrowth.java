package exercises_13;

// 12. Prints a table of the values of ln n, n, n ln n, n^2, n^3,
// for n = 16, 32, 64, ..., 2048.
public class FunctionGrowth {

	public static void main(String[] args) {
		System.out.println("ln(n)\tn\tnln(n)\tn^2\tn^3\t");
		String tab = "\t";
		int n = Integer.valueOf(args[0]);
		for (int i = 2; i < 2048; i *= 2) {
			System.out.println((int)Math.log(i) + tab + i + tab + (int)(i * Math.log(i)) + tab
							   + (int)Math.pow(i, 2) + tab + (int)Math.pow(i, 3));
		}

	}

}
