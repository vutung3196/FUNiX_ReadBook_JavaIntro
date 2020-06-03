package three;

public class GymnSTERScorer {

	public static void main(String[] args) {
		double S1 = Double.parseDouble(args[0]);
		double S2 = Double.parseDouble(args[1]);
		double S3 = Double.parseDouble(args[2]);
		double S4 = Double.parseDouble(args[3]);
		double S5 = Double.parseDouble(args[4]);
		double S6 = Double.parseDouble(args[5]);
		
		double max = Math.max(S1, Math.max(S2, Math.max(S3, Math.max(S4, Math.max(S5, S6)))));
		double min = Math.min(S1, Math.min(S2, Math.min(S3, Math.min(S4, Math.min(S5, S6)))));
		
		double sum = S1 + S2 + S3 + S4 + S5 + S6 - max - min;
		
		System.out.println("final score is : " + (sum / 4));
	}

}
