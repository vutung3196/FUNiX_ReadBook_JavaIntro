package three;

public class Jen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		for (int y = 1; y <=400; y ++) {
			int x = (y -1) + (y-1) / 4 - (y-1) / 100 + (y-1) / 400;
			int d = x % 7;
			if (d == 5) { i ++;}
			else if (d ==6) { j++;}
			else  ;		
		}
		System.out.println("so ngay thu 7 la ngay dau tien cua nam moi la " + i);
		System.out.println("so ngay chu nhat la ngay dau tien cua nam moi la " + j);
	
		
		 /*i
	         */

	}

}
