package three;

public class UPCCode {

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
