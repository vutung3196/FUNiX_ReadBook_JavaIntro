package three;

public class fri13th {

	public static void main(String[] args) {
		// vi 400 nam lap lai 1 lan nen ta se chi tinh tu nam 1 den nam 400
		
		 int m = Integer.parseInt(args[1]);
	        int d = Integer.parseInt(args[0]);
	        int y = Integer.parseInt(args[2]);

	        int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + (31*m0)/12) % 7;

	        System.out.println(d0);
	        if (d0 == 0) {System.out.println("Sunday");
	        		        }
	        else if (d0==1) {System.out.println("Monday");}
	        else if (d0==2) {System.out.println("Tue");}
	        else if (d0==3 ) {System.out.println("We");}
	        else {System.out.println("nothing");}
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
	 */
	        

	}

}
