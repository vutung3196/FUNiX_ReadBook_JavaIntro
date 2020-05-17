package package12;

public class DayOfWeek {

	public static void main(String[] args) {
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		int y0 = y - (14-m)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 *((14-m)/12) -2;
		int d0 = (d + x + 31*m0/12) % 7;
		
		String nameOfDay = "";
		
		switch (d0) {
		
		case 0:
			nameOfDay = "Sunday";
			break;
			
		case 1:
			nameOfDay = "Monday";
			break;
			
		case 2:
			nameOfDay = "Tuesday";
			break;
		
		case 3:
			nameOfDay = "Wenesday";
			break;
		
		case 4:
			nameOfDay = "Thursday";
			break;
			
		case 5:
			nameOfDay = "Friday";
			break;
			
		case 6:
			nameOfDay = "Saturday";
			break;	

		default:
			break;
		}
		
		System.out.println(nameOfDay);
	}

}
