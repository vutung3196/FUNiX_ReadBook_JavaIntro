
public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double S = (a + b + c) / 2;
		double area = Math.sqrt(S * (S - a) * (S - b) * (S - c));
		
		System.out.println(area);
		
	
				
	}

}
