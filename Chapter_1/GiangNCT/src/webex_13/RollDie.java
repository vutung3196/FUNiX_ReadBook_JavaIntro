package webex_13;

// 1. Simulate the roll of a fair six-sided die and print the resulting number.
public class RollDie {

	public static void main(String[] args) {
		int SIDE = 6;
		
		int num = (int) (Math.random() * SIDE) + 1;
		
		System.out.println(num);

	}

}
