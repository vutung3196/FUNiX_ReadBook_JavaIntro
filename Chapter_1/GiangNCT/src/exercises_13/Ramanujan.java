package exercises_13;

// 34. Find the 2 pairs (a, b) and (c, d) so that a^3 + b^3 = c^3 + d^3 = n
public class Ramanujan {

	public static void main(String[] args) {
		// Input n
		int n = Integer.valueOf(args[0]);
		String cube = "^3 ";
		for (int a = 1; a <= n; a++) {
			// (a, b)
			// a
			int aCube = a * a * a;
			if (aCube > n) break;
			// b
			for (int b = a; b <= n; b++) {
				int bCube = b * b * b;
				if (aCube + bCube > n) break;
				// (c, d)
				// c
				for (int c = a + 1; c <= n; c++) {
					int cCube = c * c * c;
					if (cCube > aCube + bCube) break;
					// d
					for (int d = c; d <= n; d++) {
						int dCube = d * d * d;
						if (cCube + dCube > aCube + bCube) break;
						if (aCube + bCube == cCube + dCube) {
							System.out.println(n + " = " + a + cube + "+" + b + cube + 
												   "= " + c + cube + "+" + d + cube);
						}
					}
				}
			}
		}

	}

}
