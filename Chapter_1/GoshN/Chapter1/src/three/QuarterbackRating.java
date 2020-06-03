package three;

public class QuarterbackRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// So lan vuot qua thanh cong
		int A = Integer.parseInt(args[0]);
		// So lan co gang vuot qua
		int B = Integer.parseInt(args[1]);
		// passing yards
		int C = Integer.parseInt(args[2]);
		//touchdown passes
		int D = Integer.parseInt(args[3]);
		//interception
		int E = Integer.parseInt(args[4]);
		// cac chi so W,X,Y,Z neu nho hon 0 thi tinh bang 0, neu lon hon 475/12 thi tinh la 475/12
		double W = 250/3*((1.0*A/B)-0.3);
		if (W <0) W =0 ;
		else if (W > 475/12.0) W = 475/12.0;
		double X = 25/6*((1.0*C/B)-3);
		if (X <0) X =0 ;
		else if (X > 475/12.0) X = 475/12.0;
		double Y = 1000/3*(1.0*D/B);
		if (Y <0) Y =0 ;
		else if (Y > 475/12.0) Y = 475/12.0;
		double Z = 1250/3*(0.095-(1.0*E/B));
		if (Z <0) Z =0 ;
		else if (Z > 475/12.0) Z = 475/12.0;
		
		double sum = W + X + Y + Z; 
		
		
		
		System.out.println(sum);
		
	//QuarterbackRating.java nho viet comment tung dong

	}

}
