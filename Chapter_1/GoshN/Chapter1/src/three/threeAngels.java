package three;

public class threeAngels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double max = Math.max((Math.max(a, b)), c);
		
		if (2 * max < (a + b + c)) {
			System.out.println(a + " , " + b + " , " + c + " is 3 sides of a triangle");
		}
		else {
			System.out.println(a + " , " + b + " , " + c + " is not 3 sides of a triangle");
		}
		
	}

}
