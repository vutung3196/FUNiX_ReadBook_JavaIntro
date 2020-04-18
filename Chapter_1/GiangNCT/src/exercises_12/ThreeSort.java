package exercises_12;

// 34. Takes three int values from the command line and prints them in ascending order.

public class ThreeSort {

	public static void main(String[] args) {
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int third = Integer.valueOf(args[2]);
		int min = Math.min(first, Math.min(second, third));
		int max = Math.max(first, Math.max(second, third));
		System.out.println(min);
		System.out.println(first + second + third - min - max);
		System.out.println(max);
	}

}
