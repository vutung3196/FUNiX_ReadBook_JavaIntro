package exercises_12;

// 21. Write a program SumOfSines.java that takes a double command-line
// argument t (in degrees) and prints the value of sin(2t) + sin(3t).
public class SumOfSines {

	public static void main(String[] args) {
		// Manually calculate radians ^^
		double t = Double.valueOf(args[0]);
		System.out.println(Math.sin(2 * t * Math.PI / 180) 
				         + Math.sin(3 * t * Math.PI / 180));
	}

}
