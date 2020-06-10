package exercises_13;

// 22. Puts the binary representation of a positive integer n into a String variable s
public class IntegerToBinary {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String s = "";
		for (int i = n; i > 0; i /= 2) {
			s = (i % 2) + s;
		}
		System.out.println(s);
	}

}
