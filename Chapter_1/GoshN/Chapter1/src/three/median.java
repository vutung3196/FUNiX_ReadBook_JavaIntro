package three;

public class median {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);
		*/
		static void soThuBa(int arr[]) {
			int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

			for (int i = 1; i < 5; i++) {
				if (arr[i] > first) {
					third = second;
					second = first;
					first = arr[i];
				} else if (arr[i] > second) {
					third = second;
					second = arr[i];
				} else if (arr[i] > third) {
					third = arr[i];
				}
			}
			System.out.println(third);
		}


		public static void main(String[] args) {
			int arr[] = { 12, 13, 15, 10, 34 };
			soThuBa(arr);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
	}


