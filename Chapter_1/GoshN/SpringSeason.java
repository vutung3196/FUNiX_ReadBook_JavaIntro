
public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai báo m và d
		 int month = Integer.parseInt(args[0]);
	     int day   = Integer.parseInt(args[1]);
	     // liệt kê từ 20/3 đến 20/6
	     boolean Spring =  (month == 3 && day > 19 && day < 32) 
	    		 ||
	    		 (month == 4 && day >  0 && day < 31) 
	    		 ||
	    		 (month == 5 && day >  0 && day < 32) 
	    		 ||
	    		 (month == 6 && day >  0 && day < 21);

	        System.out.println(Spring);
	}

}
