package webex_13;

// 15. Assume the couple keeps having children until they have another child which is of the same sex as the first child.
// How does your answer change if p is different from 1/2?
public class SameGender {
	
	public static void main(String[] args) {
		int CASES = 1000;
		int[] commons = new int [CASES];
		int sum = 0;
		double p = 1.0 / 50;
		for (int i = 0; i < CASES; i++) {
			int count = 0;
			boolean firstGender = Math.random() < p;
			boolean currentGender = !firstGender;
			while (currentGender != firstGender) {
				currentGender = Math.random() < p;
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
