package webex_13;

// 25. w = 35.74 + 0.6215t + (0.4275t - 35.75)v^0.16
public class WindChillRevisited {

	public static void main(String[] args) {
		double t = Double.valueOf(args[0]);
		double v = Double.valueOf(args[1]);
		if (v < 3 || v > 110) {
		  System.out.println("The wind speed must be in [3, 110] range");
		} else {
		  System.out.println(35.74 + 0.6215 * t + (0.4275 * t - 35.75) 
						   * Math.pow(v,0.16));
		}
	}

}
