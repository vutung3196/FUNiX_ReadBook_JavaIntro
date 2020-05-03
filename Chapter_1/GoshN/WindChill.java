
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//w = 35,74 + 0,6215 t + (0,475 t - 35,75) v 0,16  ( v mũ 0,16)  Math.pow (a, b để biểu thị a mũ b 
		
		// khai bao t va v w
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		
		System.out.println(w);
		
	}

}
