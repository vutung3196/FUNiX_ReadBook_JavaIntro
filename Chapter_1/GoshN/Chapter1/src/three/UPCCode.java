package three;

public class UPCCode {
	// The Universal Product Code (UPC) is a 12 digit code that uniquely specifies a product. 
	//The least significant digit d1(rightmost one) is a check digit which is the uniquely determined
	//by making the following expression a multiple of 10:
	//(d1 + d3 + d5 + d7 + d9 + d11) + 3 (d2 + d4 + d6 + d8 + d10 + d12)
	public static void main(String[] args) {

		 long n = Long.parseUnsignedLong(args[0]);
	        String upccode = "";

	        int sum = 0;
	        for (int i = 2; i <= 12; i++) {
	            long digit = n % 10;
	            if (i == 2 || i == 7 || i == 12) {
	            	upccode = "-" + upccode;            	
	            }
	            upccode = digit + upccode;
	            if (i % 2 == 0) {
	            	sum += 3 * digit;
	            }
	            else {
	            	sum += digit;
	            }

	            n = n / 10;
	        }     
	        	upccode += (10 - sum % 10);

	        System.out.println(upccode);
	}

}
