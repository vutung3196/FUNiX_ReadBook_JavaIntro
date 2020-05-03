
public class CMYKtoRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C = Double.parseDouble(args[0]);
		double M = Double.parseDouble(args[1]);
		double Y = Double.parseDouble(args[2]);
		double K = Double.parseDouble(args[3]);
		
		int R = (int) (255 * (1 - C) * (1 - K));
		int G = (int) (255 * (1 - M) * (1 - K));
		int B = (int) (255 * (1 - Y) * (1 - K));
		
		double R0 = R / 255.0;
		double G0 = G / 255.0;
		double B0 = B / 255.0;		
		//K = 1 - Math.max(R0, Math.max(G0, B0));
		
		System.out.println("RGB =" + "(" + R + "," + G + "," + B + ")");
		/*
		 System.out.println(R0);
		System.out.println(G0);
		System.out.println(B0);
		*/
		C = (1 - R0 - K) / (1 - K);
		M = (1 - G0 - K) / (1 - K);
		Y = (1 - B0 - K) / (1 - K);
		System.out.println(C);
		System.out.println(M);
		System.out.println(Y);
		System.out.println(K);
		
	}

}
