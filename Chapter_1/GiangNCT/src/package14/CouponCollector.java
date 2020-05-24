package package14;

public class CouponCollector {

	public static void main(String[] args) {
		//int n = Integer.valueOf(args[0]);
		int n = 5;
		int trials = 100000;
		int sum = 0;
		
		for (int i = 0; i < trials; i++) {
			int count = 0;
			boolean[] pickedUp = new boolean[n];
			int distinct = 0;
			while (distinct < n) {
				int num = (int) (Math.random() * n);
				if (!pickedUp[num]) {
					distinct++;
					pickedUp[num] = true;
				}
				count++;
			}
			//System.out.println("Count: " + count);
			sum += count;
		}
				
		System.out.println("Sum: " + sum/100000.0);
	}

}
