package webex_12;

// 30. Reads in three command-line arguments P, Y, and R and calculates the monthly payments you would have to make 
// over Y years to pay off a P dollar loan at R per cent interest compounded monthly
//                  P r 
// payment =  ---------------,  where n = 12 * Y, r = (R / 100) / 12
// 			 1  - (1 + r)^(-n)
public class CarLoan {

	public static void main(String[] args) {
		double payOff = Double.valueOf(args[0]);
		double year = Double.valueOf(args[1]);
		double rate = Double.valueOf(args[2]);
		double n = 12 * year;
		double r = (rate / 100) / 12;
		double payment = payOff * r / (1 - Math.pow(1 + r, -n));
		System.out.println("Payment: " + payment);
	}

}
