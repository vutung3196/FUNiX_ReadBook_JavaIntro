package three;

public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c = Double.parseDouble(args[0]);
        double epsilon = 1.0e-15;  
        double t = c;              
        if (t < 0) {
        	System.out.println("can't fint sqrt");
        }
        else {
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
           
        }

        System.out.println(t);
        }
 
// kiem tra lai comment va ham if
	}

}
