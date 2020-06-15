package three;

public class Zodiac {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		System.out.println("date " + day + "/" + month + " is :");
		if(month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("does not exist");
		}
		if ((month == 1 && day >= 20) 
			|| (month == 2 && day <= 17)) {
				System.out.println("Aquarius");
			}
		else if ((month == 2 && day >= 18) 
				|| (month == 3 && day <= 19)) {
			System.out.println("Pisces");
		}
		else if ((month == 3 && day >= 20) 
				|| (month == 4 && day <= 19)) {
			System.out.println("Aries");
		}
		else if ((month == 4 && day >= 20) 
				|| (month == 5 && day <= 20)) {
			System.out.println("Taurus");
		}
		else if ((month == 5 && day >= 21) 
				|| (month == 6 && day <= 20)) {
			System.out.println("Gemini");
		}
		else if ((month == 6 && day >= 21) 
				|| (month == 7 && day <= 22)) {
			System.out.println("Cancer");
		}
		else if ((month == 7 && day >= 23) 
				|| (month == 8 && day <= 22)) {
			System.out.println("Leo");
		}
		else if ((month == 8 && day >= 23) 
				|| (month == 9 && day <= 22)) {
			System.out.println("Virgo");
		}
		else if ((month == 9 && day >= 23) 
				|| (month == 10 && day <= 22)) {
			System.out.println("Libra");
		}
		else if ((month == 10 && day >= 23) 
				|| (month == 11 && day <= 21)) {
			System.out.println("Scorpio");
		}
		else if ((month == 11 && day >= 22) 
				|| (month == 12 && day <= 21)) {
			System.out.println("Sagittarius");
		}
		else {
			System.out.println("Capricorn");
		}

	}

}
