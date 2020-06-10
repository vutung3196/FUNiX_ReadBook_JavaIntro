package package14;

public class Sample {

	public static void main(String[] args) {
		int m = 10;
		int n = 100;
		
		int[] ns = new int[n];
		for (int i = 0; i < n; i++) {
			ns[i] = i;
		}
		
		for (int i = 0; i < m; i++) {
			int r = i + (int) (Math.random() * (n - i));
			int tmp = ns[r];
			ns[r] = ns[i];
			ns[i] = tmp;
		}
		
		for (int i = 0; i < m; i++) {
			System.out.print(ns[i] + " ");
		}

	}

}
