package three;

public class fri13th {

	public static void main(String[] args) {
		// vi 400 nam lap lai 1 lan nen ta se chi tinh tu nam 1 den nam 400
		
		for (int y = 1; y <401; y++) {
			for (int m = 1; m < 12; m++) {
	        int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (13 + x + (31*m0)/12) % 7;

	     
	        if (d0 == 5) {System.out.println(m + " " + y);}
       
	        else ;
		}
		}
	/* 
	 * có thể dễ hơn
	 * các thứ cách nhau 7 ngày
	 * để có thứ 6 ngày 13 thì ngày đầu tiên của tháng phải rơi vào ngày chủ nhật
	 * 
	 * xác định các tháng có ngày đầu tiên rơi vào chủ nhật
	 * sau đó tính khoảng cách của 2 tháng xa nhất
	 * if y = 1;
	 * d=13; 
	 * m=1 true or false
	 * m=2 true or false
	 * m3...
	 * m12
	 * 
	 * in ra tất cả thứ 6 ngày 13 các năm từ 1 đến 400
	 * 
	 * d0=5
	 * 
	 * d=13
	 * 
	 * m = 1 - 12
	 * y = 1 - 400
	 * 
	 * print  m y 
	 * 
	 */
	        

	}

}
