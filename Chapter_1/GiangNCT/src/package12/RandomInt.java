package package12;

public class RandomInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a positive integer
		int n = Integer.parseInt(args[0]);
		// automatic type conversion
		long m = n;
		// error: automatic type conversion doesn't work
		//int l = m;
		
		// a pseudo-random real between 0.0 and 1.0
		double r = Math.random();
		
		// a pseudo-random integer between 0 and n - 1
		// casting
		int value = (int) (r*n);
		
		System.out.println(value);
		System.out.println(m);
	}
	// XOR
	// a       b           a^b
	// true    false       true
	// false   true        true
	// true    true        false
	// false   false       false

}
