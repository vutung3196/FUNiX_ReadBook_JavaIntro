package webex_13;

// 22.  takes 6 real command line inputs representing the 6 scores
// and prints their average, after throwing out the high and low scores.
public class GymnasticScorer {

	public static void main(String[] args) {
		int SCORE_NUM = 6;
		double[] array = new double[SCORE_NUM];
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		double sum = 0.0;
		for (int i = 0; i < SCORE_NUM; i++) {
			//array[i] = Double.valueOf(args[i]);
			array[i] = Math.random() * SCORE_NUM;
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		for (double num : array) {
			System.out.print(num + " ");
			if (num != max && num != min) {
				sum += num;
			}
		}
		
		System.out.println("\nAverage: " + sum / 4);

	}

}
