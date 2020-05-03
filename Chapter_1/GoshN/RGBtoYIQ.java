
public class RGBtoYIQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = Integer.parseInt(args[0]);
		int G = Integer.parseInt(args[1]);
		int B = Integer.parseInt(args[2]);
		double R0 = R / 255.0;
		double G0 = G / 255.0;
		double B0 = B / 255.0;
		double Y = 0.2990 * R0 + 0.5870 * G0 + 0.1140 * B0;
		double I = 0.5959 * R0 - 0.2746 * G0 - 0.3213 * B0;
		double Q = 0.2115 * R0 - 0.5227 * G0 + 0.3112 * B0;
		
		System.out.println("RGB " + "(" + R + "," + G + "," + B + ")" + "= YIQ" + "(" + Y + "," + I + "," + Q + ")" );
		System.out.println("Y =" + Y);
		System.out.println("I =" + I);
		System.out.println("Q =" + Q);
	}

}
