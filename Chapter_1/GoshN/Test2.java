
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int pow = 1;
		while (pow <= n / 2) {
		pow = pow * 2; 
		}
		while (pow > 0) {
			if (n < pow) 
				System.out.print(0);
			else
				System.out.print(1);
				n = n - pow;
					}
		pow = pow / 2;
	}
		System.out.println();
}
