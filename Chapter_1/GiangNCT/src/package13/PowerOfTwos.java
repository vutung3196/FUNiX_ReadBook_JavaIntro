package package13;

public class PowerOfTwos {

	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		
		int i = 0;
		int powerOfTwo = 1;
		
		while(i <= n) {
			System.out.println(i + " " + powerOfTwo);
			powerOfTwo *= 2;
			i++;
		}

	}

}
