package webex_13;

// 13. A couple beginning a family decides to keep having children until they have at least one of either sex.
// Estimate the average number of children they will have via simulation
public class BoysAndGirls {

	public static void main(String[] args) {
		int CASES = 1000;
		int[] commons = new int [CASES];
		int sum = 0;
		for (int i = 0; i < CASES; i++) {
			boolean haveBoy = false, haveGirl = false;
			int count = 0;
			while (!(haveBoy && haveGirl)) {
				double child = Math.random();
				if (child < 0.5) {
					haveBoy = true;
				} else {
					haveGirl = true;
				}
				count++;
			}
			commons[count]++;
			sum += count;
		}
		int maxIndex = 0;
		for (int i = 0; i < CASES; i++) {
			if (commons[i] > commons[maxIndex]) maxIndex = i;
		}
		
		System.out.println("Average children: " + sum / 1000.0);
		System.out.println("Most common outcomes: " + maxIndex + " " + commons[maxIndex]);
	}

}
