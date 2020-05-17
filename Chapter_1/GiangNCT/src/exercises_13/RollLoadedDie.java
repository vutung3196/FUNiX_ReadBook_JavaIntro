package exercises_13;

// 5. Prints the result of rolling a loaded die such that 
// the probability of getting a 1, 2, 3, 4, or 5 is 1/8 and the probability of getting a 6 is 3/8.
public class RollLoadedDie {

	public static void main(String[] args) {
		double roll = Math.random();
		
		if (roll < 0.1) System.out.println(1);
		else if (roll < 0.2) System.out.println(2);
		else if (roll < 0.3) System.out.println(3);
		else if (roll < 0.4) System.out.println(4);
		else if (roll < 0.5) System.out.println(5);
		else System.out.println(6);
	}

}
