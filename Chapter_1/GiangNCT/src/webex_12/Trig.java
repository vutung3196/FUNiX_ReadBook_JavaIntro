package webex_12;

// 31. Illustrate various trigonometric functions in the Math library, such as Math.sin(),
// Math.cos(), and Math.toRadians().
public class Trig {

	public static void main(String[] args) {
		double angle = 45;
		double rad = Math.toRadians(angle);
		
		// sin
		double sin = Math.sin(rad);
		System.out.println("Sin: " + sin);
		
		// cos
		double cos = Math.cos(rad);
		System.out.println("Cos: " + cos);
		
		// tan == sin/cos
		double tan = Math.tan(rad);
		System.out.println("Tan: " + tan);
		System.out.println("Sin/cos: " + sin / cos);
		
		// sin^2 + cos^2 == 1
		System.out.println("sin^2 + cos^2 = " + (Math.pow(sin, 2) + Math.pow(cos, 2)));
	}

}
