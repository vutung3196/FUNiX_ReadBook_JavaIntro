package webex_12;

// 4. Reads in four command line inputs C, M, Y, and K between 0 and 1,
// and prints the corresponding RGB parameters
// Reverse to verify
public class CMYKtoRGB {

	public static void main(String[] args) {
		// (0.5, 0.3, 0.6, 0.2) = (102, 143, 81)
		// double C = 0.5, M = 0.3, Y = 0.6, K = 0.2;
		double C = Double.valueOf(args[0]);
		double M = Double.valueOf(args[1]);
		double Y = Double.valueOf(args[2]);
		double K = Double.valueOf(args[3]);
		System.out.println("CMYK: (" + C + ", " + M + ", " + Y + ", " + K + ")");
		int R = (int) (255 * (1 - C) * (1 - K));
		int G = (int) (255 * (1 - M) * (1 - K));
		int B = (int) (255 * (1 - Y) * (1 - K));
		System.out.println("RGB: (" + R + ", " + G + ", " + B + ")");
		// Reversed
		double Rc  = R / 255.0;
		double Gc = G / 255.0;
		double Bc = B / 255.0;
		// The main point here is K should be kept as the original value
		C = (1 - Rc - K) / (1 - K);
		M = (1 - Gc - K) / (1 - K);
		Y = (1 - Bc - K) / (1 - K);
		System.out.println("CMYK: (" + C + ", " + M + ", " + Y + ", " + K + ")");
	}

}
