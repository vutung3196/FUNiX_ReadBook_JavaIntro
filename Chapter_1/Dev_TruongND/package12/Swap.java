package package12;

public class Swap {
	
	public static void main(String args[]) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("a value before: " + a);
		System.out.println("b value before: " + b);
		
		//Swap the values
		
		int temp;
		
		temp = a;
		
		a = b;
		
		b = temp;
		
		System.out.println("a value after: " + a);
		System.out.println("b value after: " + b);
		
		
	}

}
