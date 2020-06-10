package webex_13;

//3. Takes five integer command-line arguments and prints the median (the third largest one).
//4. no more than 6 comparisons
public class Median {

	public static void main(String[] args) {
		int n = 5;
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		// Test hard-code
		// int[] array = {1, 5, 2, 3, 6};
		int first = array[0], second = 0, third = 0;
		
		for (int i = 0; i < n; i++) {
			if (array[i] > first) {
				third = second;
				second = first;
				first = array[i];
			} else if (array[i] > second) {
				third = second;
				second = array[i];
			} else if (array[i] > third) {
				third = array[i];
			}
		}
		System.out.println(third);

	}

}
