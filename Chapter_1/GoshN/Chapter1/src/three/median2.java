package three;

public class median2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = (int) (Math.random() * 100);
		System.out.print(x1 + " ");
		int x2 = (int) (Math.random() * 100);
		int x3 = (int) (Math.random() * 100);
		int x4 = (int) (Math.random() * 100);
		int x5 = (int) (Math.random() * 100);
		System.out.print(x2 + " ");
		System.out.print(x3 + " ");
		System.out.print(x4 + " ");
		System.out.println(x5);
		int arr[] = { x1, x2, x3, x4, x5 };

	int first = arr[0], second = 0, third = 0;

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
	System.out.println("so thu ba la = " + third);
}
}