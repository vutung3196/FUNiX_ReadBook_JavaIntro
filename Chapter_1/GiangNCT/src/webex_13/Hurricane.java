package webex_13;

// 8. takes the wind speed (in miles per hour) as an integer command-line argument 
// and prints whether it qualifies as a hurricane
public class Hurricane {

	public static void main(String[] args) {
		int windSpeed = Integer.valueOf(args[0]);
		if (windSpeed < 74) System.out.println("No hurricane");
		else if (windSpeed < 95) System.out.println("Category 1");
		else if (windSpeed < 110) System.out.println("Category 2");
		else if (windSpeed < 130) System.out.println("Category 3");
		else if (windSpeed < 155) System.out.println("Category 4");
		else System.out.println("Category 5");
	}

}
