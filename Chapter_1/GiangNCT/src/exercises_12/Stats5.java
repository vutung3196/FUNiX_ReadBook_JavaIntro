package exercises_12;

// 30.  prints five uniform random values between 0 and 1,
// their average value, and their minimum and maximum value.
public class Stats5 {

	public static void main(String[] args) {
		double no1 = Math.random();
		double no2 = Math.random();
		double no3 = Math.random();
		double no4 = Math.random();
		double no5 = Math.random();
		// avg value
		double avg = (no1 + no2 + no3 + no4 + no5) / 5;
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
