
public class StandardDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = Double.parseDouble(args[0]);
		double x2 = Double.parseDouble(args[1]);
		double x3 = Double.parseDouble(args[2]);
		double x4 = Double.parseDouble(args[3]);
		double x5 = Double.parseDouble(args[4]);
		double x6 = Double.parseDouble(args[5]);
		
		double avg = (x1 + x2 + x3 + x4 + x5 + x6) / 6;
		
		 double S = ((x1 - avg) *  (x1 - avg) + (x2 - avg) * (x2 - avg) +
				(x3 - avg) * ( x3 - avg) + ( x4 -avg) * (x4 - avg) + 
				( x5 -avg) * (x5 - avg) + ( x6 -avg) * (x6 - avg)) / 6;
				
		double Q = Math.sqrt((Math.pow((x1-avg), 2) + Math.pow((x2-avg), 2) + Math.pow((x3-avg), 2) + Math.pow((x4-avg), 2) + Math.pow((x1-avg), 2) + Math.pow((x5-avg), 2) + Math.pow((x6-avg), 2)) / 6);
		
		Math.pow(1, 14);
		
		double SD = Math.sqrt(S);
		
		System.out.println("Standard deviation is " + SD);
		System.out.println("Standard deviation is " + Q);
	}

}
