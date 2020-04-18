package webex_12;

// 3.1 Takes an RGB color (three integers between 0 and 255) and transforms it to a YIQ color
public class RGBtoYIQ {
	public static void main(String[] args) {
		System.out.println("RGB to YIQ");
		//int R = 100, G = 200, B = 150;
		int R = Integer.parseInt(args[0]);
		int G = Integer.parseInt(args[1]);
		int B = Integer.parseInt(args[2]);
		System.out.println("RGB: (" + R + ", " + G + ", " + B + ")");
		double Y = (0.299 * R + 0.587 * G + 0.114 * B)/255;
		double I = (0.5959 * R - 0.2746 * G - 0.3213 * B)/255;
		double Q = (0.2115 * R - 0.5227 * G + 0.3112 * B)/255;
		System.out.println("YIQ: (" + Y + ", " + I + ", " + Q + ")");
	}
}
