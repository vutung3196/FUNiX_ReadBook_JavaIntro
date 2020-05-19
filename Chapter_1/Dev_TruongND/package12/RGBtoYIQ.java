package package12;

import java.text.DecimalFormat;

public class RGBtoYIQ {

	public static void main(String[] args) {
		//take RGB values
		int R = Integer.parseInt(args[0]);
		int G = Integer.parseInt(args[1]);
		int B = Integer.parseInt(args[2]);
		
		//transfer to YIQ values
		double Y = 0.299*R + 0.587*G + 0.114*B;
		double I = 0.5959*R + (-0.2746)*G + (-0.3213)*B;
		double Q = 0.2115*R + (-0.5227)*G + 0.3112*B;
		
		DecimalFormat numberFormat = new DecimalFormat("#.000");
		String[] YIQ = {numberFormat.format(Y), numberFormat.format(I), numberFormat.format(Q)};
		
		System.out.println("RGB color code: " + "(" + R + "," + G +"," + B + ")");
		System.out.println("YIQ color code: " + "(" + YIQ[0] + "," + YIQ[1] +"," + YIQ[2] + ")");
		
	}

}
