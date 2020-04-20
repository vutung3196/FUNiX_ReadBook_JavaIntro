package exercises_12;

// 29. Takes a date as input and prints the day of the week that date falls on
public class DayOfWeek {

	public static void main(String[] args) {
		int month = Integer.valueOf(args[0]);
		int day = Integer.valueOf(args[1]);
		int year = Integer.valueOf(args[2]);
		int y0 = year - (14-month)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = month + 12 * (14 - month) / 12 - 2;
		int d0 = (day + x + 31 * m0 / 12) % 7;
		System.out.println(d0);
	}

}
