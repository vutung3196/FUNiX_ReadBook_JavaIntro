
public class PowersOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int i = 0;
		int powerOfTwo = 1;
		
		while ( i <= n) {
			
			
			System.out.println("2 ^ " + i + " = " + powerOfTwo);
			
			i = i + 1;
			powerOfTwo = 2 * powerOfTwo;
		}
		

	}

}
