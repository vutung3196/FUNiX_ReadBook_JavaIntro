package webex_12;

// 11. Modify Exercise 1.2.30 so that it prints the sample standard deviation in addition to the average.
public class StandardDeviation {

	public static void main(String[] args) {
		
		double no1 = Math.random();
		double no2 = Math.random();
		double no3 = Math.random();
		double no4 = Math.random();
		double no5 = Math.random();
		// avg value
		double avg = (no1 + no2 + no3 + no4 + no5) / 5;
		// modification start
		double sum = Math.pow(no1 - avg, 2) + Math.pow(no2 - avg, 2) + Math.pow(no3 - avg, 2) +
				Math.pow(no4 - avg, 2) + Math.pow(no5 - avg, 2);
		double dev = Math.sqrt(1 / 5.0 * sum);
		System.out.println("Deviation: " + dev);
		// end modification
		// min
		double min = Math.min(no1, Math.min(no2, Math.min(no3, Math.min(no4, no5))));
		// max
		double max = Math.max(no1, Math.max(no2, Math.max(no3, Math.max(no4, no5))));
		// result
		System.out.println("no1: " + no1 + ", no2: " + no2 + ", no3: " 
							+ no3 + ", no4: " + no4 + ", no5: " + no5);
		System.out.println("avg: " + avg + ", min: " + min + ", max: " + max);

	}

}
