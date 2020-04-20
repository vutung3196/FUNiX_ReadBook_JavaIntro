package webex_12;

// 20. Takes three command line inputs a, b, and c, representing the side lengths of a triangle,
// and prints the area of the triangle using Heron's formula: area = sqrt(s(s-a)(s-b)(s-c)),
// where s = (a + b + c) / 2.
public class TriangleArea {

	public static void main(String[] args) {
		double a = Double.valueOf(args[0]);
		double b = Double.valueOf(args[1]);
		double c = Double.valueOf(args[2]);
		double s = (a + b + c) / 2;
		System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
	}
	
}
