package exercises_12;

//23. Write a program SpringSeason.java that takes two int values m and d from the command line
//and prints true if day d of month m is between March 20 (m = 3, d =20) and June 20 
//(m = 6, d = 20), false otherwise.
public class SpringSeason {

	public static void main(String[] args) {
		int month = Integer.valueOf(args[0]);
		int day = Integer.valueOf(args[1]);
		System.out.println((month == 3 && day >=20) || (month == 4 && day < 31)
						|| (month == 5 && day < 32) || (month == 6 && day <= 20));

	}

}
