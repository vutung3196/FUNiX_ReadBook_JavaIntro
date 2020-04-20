package exercises_12;

// 20. Write a program SumOfTwoDice.java that prints
// the sum of two random integers between 1 and 6 (such as you might get when rolling dice).

public class SumOfTwoDice {

	public static void main(String[] args) {
		// First number
		// Generate random with Math.random()
		// The result would be from 0.0 to 1.0
		double seed = Math.random();
		// Make it larger upto 999
		int firstNum = (int) (seed * 1000);
		// Now reshape it to the range [1, 6]
		firstNum = firstNum % 6 + 1;
		// Second number analogously
		seed = Math.random();
		int secondNum = (int) (seed * 1000);
		secondNum = secondNum % 6 + 1;
		System.out.println(firstNum + secondNum);
	}

}
