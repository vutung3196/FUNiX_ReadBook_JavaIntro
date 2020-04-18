package webex_12;


// 17. Takes four real-valued command line parameters x1, y1, x2, and y2 and prints
// the Euclidean distance between the points (x1, y1) and (x2, y2)
public class EuclideanDistance {

	public static void main(String[] args) {
		double x1 = Double.valueOf(args[0]);
		double y1 = Double.valueOf(args[1]);
		double x2 = Double.valueOf(args[2]);
		double y2 = Double.valueOf(args[3]);
		System.out.println("Euclidean distance: " + Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
	}

}
