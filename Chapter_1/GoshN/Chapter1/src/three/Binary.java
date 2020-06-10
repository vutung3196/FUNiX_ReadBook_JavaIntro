package three;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = Integer.parseInt(args[0]);
		 int count = 0;
		 while (Math.pow(2, count) <= n) {
			 count++;
		 }
		 //System.out.println("gia tri j = " + j);
		 int[] a = new int[count];	
		 for (int i = 0; i < count; i++) {	
		 		if (n % 2 == 0) {
		 			a[i] = 0;
		 		}
		 		else {
		 			a[i] = 1;
		 		}		
		 		
		 		//System.out.println("i : " + i);
		 		n = n/2;
		 		//System.out.print(a[i]);
		 }
		 for (int i = count - 1; i >= 0; i--) {
			 System.out.print(a[i]);
		 }

	}

}
