package webex_13;

// 20. Rewrite DayOfWeek.java from Exercise 1.2.29 
// so that it prints the day of the week as Sunday, Monday, and so forth instead of an integer between 0 and 6.
// Use a switch statement.
public class DayOfWeek {

	public static void main(String[] args) {
		int month = Integer.valueOf(args[0]);
		int day = Integer.valueOf(args[1]);
		int year = Integer.valueOf(args[2]);
		int year0 = year - (14 - month) / 12;
		int x = year0 + year0 / 4 - year0 / 100 + year0 / 400;
		int month0 = month + 12 * ((14 - month) / 12) - 2;
		int day0 = (day + x + (31 * month0) / 12) % 7;
		switch (day0) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				break;
		}
	}

}
