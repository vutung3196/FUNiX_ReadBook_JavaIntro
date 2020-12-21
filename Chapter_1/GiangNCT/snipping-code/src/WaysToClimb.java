
public class WaysToClimb {

	public static void main(String[] args) {
		waysToClimb(5);
	}
	
	static void waysToClimb(int n) {
		if (n == 0) {
			System.out.println("]");
		}
		
		if (n == 1) {
			System.out.print("1, ");
			waysToClimb(n - 1);
		}
		
		if (n >= 2) {
			System.out.print("2, ");
			waysToClimb(n - 2);
		}
	}

}
