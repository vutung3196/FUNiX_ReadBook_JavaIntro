package webex_12;

//3.1 Takes an YIQ color and transforms it to a RGB color
public class YIQtoRGB {
	public static void main(String[] args) {
		System.out.println("YIQ to RGB");
		//double Y = 0.644705, I = -0.170686, Q = -0.143960;
		double Y = Double.parseDouble(args[0]);
		double I = Double.parseDouble(args[1]);
		double Q = Double.parseDouble(args[2]);
		System.out.println("YIQ: (" + Y + ", " + I + ", " + Q + ")");
		int R = (int) ((Y + 0.956 * I + 0.619 * Q) * 255);
		int G = (int) ((Y - 0.272 * I - 0.647 * Q) * 255);
		int B = (int) ((Y - 1.106 * I + 1.703 * Q) * 255);
		System.out.println("RGB: (" + R + ", " + G + ", " + B + ")");
	}
}
