package package14;

public class PrimeSieve {

	public static void main(String[] args) {
		// int n = Integer.valueOf(args[0]);
		int n = 19;
		boolean[] sieve = new boolean[n+1];
		
		for (int i = 2; i <= n; i++) {
			sieve[i] = true;
		}
		
		for (int factor = 2; factor * factor < n; factor++) {
			if (sieve[factor]) {
				for (int j = 0; j * factor <= n; j++) {
					sieve[factor * j] = false;
				}
			}
		}
		
		int count = 0;
		for (boolean element : sieve) {
			if (element) count++;
		}
		
		System.out.println("Primes: " + count);
	}

}
