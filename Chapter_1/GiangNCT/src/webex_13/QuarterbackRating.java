package webex_13;

// 23. takes five command line inputs A, B, C, D, and E, and prints the quarterback rating
// Completed passes (A), pass attempts (B), passing yards (C), touchdown passes (D), and interception (E)
// Completion ratio: W = 250/3 * ((A / B) - 0.3).
// Yards per pass: X = 25/6 * ((C / B) - 3).
// Touchdown ratio: Y = 1000/3 * (D / B)
// Interception ratio: Z = 1250/3 * (0.095 - (E / B))
public class QuarterbackRating {

	public static void main(String[] args) {
		/*
		// Completed passes
		int a = Integer.valueOf(args[0]);
		// pass attempts
		inte b = Integer.valueOf(args[1]);
		// passing yards
		int c = Integer.valueOf(args[2]);
		// touchdown passes
		int d = Integer.valueOf(args[3]);
		// interception 
		int e = Integer.valueOf(args[4]);
		*/
		int RATE = 50;
		int a = (int) (Math.random() * RATE);
		int b = (int) (Math.random() * RATE);
		int c = (int) (Math.random() * RATE);
		int d = (int) (Math.random() * RATE);
		int e = (int) (Math.random() * RATE);
		double w = 250.0 / 3 * (((double)a / b) - 0.3);
		double x = 25.0 / 6 * (((double) c / b) - 3);
		double y = 1000.0 / 3 * ((double) d / b);
		double z = 1250.0 / 3 * (0.095 - ((double) e / b));
		double quarterBack = w + x + y + z;
		quarterBack = quarterBack < 0 ? 0 : quarterBack;
		quarterBack = quarterBack > 475.0/12 ? 475.0/12 : quarterBack;
		System.out.println("Quarterback rating: " + quarterBack);
	}

}
