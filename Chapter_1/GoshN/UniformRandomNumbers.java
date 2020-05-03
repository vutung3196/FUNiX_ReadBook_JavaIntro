
public class UniformRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = Math.random();
		double x2 = Math.random();
		double x3 = Math.random();
		double x4 = Math.random();
		double x5 = Math.random();
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		/*
		double a = Math.max(x1, x2);
		double b = Math.max(a, x3);
		double c = Math.max(b, x4);
		double d = Math.max(c, x5);
		System.out.println(d);
		double a0 = Math.min(x1, x2);
		double b0 = Math.min(a0, x3);
		double c0 = Math.min(b0, x4);
		double d0 = Math.min(c0, x5);
		System.out.println(d0);
		*/
		double avg = (x1 + x2 + x3 + x4 + x5) / 5;
		System.out.println("avg = " + avg);
		double min = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
		double max = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		
	}

}
