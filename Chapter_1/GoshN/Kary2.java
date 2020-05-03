
public class Kary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int i = Integer.parseInt(args[1]);
		
		int pow = 1;
			while (pow <= n / i) {
				pow *= i;
			}

	        while (pow > 0) {

	            if (pow > n){
	                System.out.print(0);
	            }

	            else {
	            	int di = n / pow;
	            	if (di > 9) {
	            		 char charDi = (char)('a' + (di - 10));
	            		 System.out.print(charDi);}
	                else 	            		 	            	
	            	System.out.print(di);
	                n -= pow * di;
	            }
	            pow /= i;
	        }

	        System.out.println();
	}

}
