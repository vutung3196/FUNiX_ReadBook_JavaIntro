package exercises_12;

// 25. w = 35.74 + 0.6215t + (0.4275t - 35.75)v^0.16
public class WindChill {

	public static void main(String[] args) {
		double t = Double.valueOf(args[0]);
		double v = Double.valueOf(args[1]);
		System.out.println(35.74 + 0.6215 * t + (0.4275 * t - 35.75) 
						   * Math.pow(v,0.16));
	}

}
