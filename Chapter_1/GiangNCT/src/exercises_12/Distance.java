package exercises_12;

// 18. Write a program Distance.java that takes two integer command-line arguments 
// x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
public class Distance {

	public static void main(String[] args) {
		// Lazy evaluation: sqrt(x^2 + y^2) = distance
		System.out.println(Math.sqrt(Math.pow(Double.valueOf(args[0]), 2.0) +
						   Math.pow(Double.valueOf(args[1]), 2.0)));

	}

}
