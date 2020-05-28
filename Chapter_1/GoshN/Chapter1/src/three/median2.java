package three;

public class median2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a;
		a = new int [5];
		for (int i = 0; i < 5; i ++)
			a[i] = (int)(Math.random() *100);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		int first = a[0], second = 0, third = 0;
		for (int i = 0; i < 5; i ++) {
			if (a[i] > first ) {
				third = second;
				second = first;
				first = a[i];
			}
			else if (a[i] > second) {
				third = second;
				second = a[i]; }
			else if (a[i] > third) {
				third = a[i];
			}
						
			}
		System.out.println("so thu ba la = " + third);
	}
}