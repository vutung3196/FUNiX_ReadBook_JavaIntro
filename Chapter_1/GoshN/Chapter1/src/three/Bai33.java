package three;

public class Bai33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nhap vao N so, tinh do lech chuan va gia tri trung binh
		// 34 sinh ra n so ngau nhien
		// ten bien phai la 1 tu, ngoai tru cac bien dem nhu i,j,k
		
		int n = Integer.parseInt(args[0]);
		int[] numbers = new int [n];
		double[] sumOfNumbers = new double [n];
		int sum = 0;
		int psum = 0;
		for (int i = 0; i < n; i++) {
			numbers[i] = (int) (100 * Math.random());
			System.out.print(numbers[i] + " ");
			sum += numbers[i];		
		}
		
		double avg = 1.0 * sum / n;
		for (int i = 0; i < n; i++) {
			sumOfNumbers[i] = numbers[i] - avg;
			double powOfSum = Math.pow(sumOfNumbers[i], 2);
			psum += powOfSum;
			
		}		
		System.out.println();
		System.out.println("trung binh cua day so la = " + avg);
		System.out.println("do lech chuan bang = " + Math.sqrt(psum / n));	
		
	}

}
