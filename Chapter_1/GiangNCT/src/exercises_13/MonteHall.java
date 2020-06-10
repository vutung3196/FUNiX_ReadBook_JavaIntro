package exercises_13;

public class MonteHall {

	public static void main(String[] args) {
		//int trials = Integer.valueOf(args[0]);
		int trials = 10000000;
		int wins = 0;
		
		for (int i = 0; i < trials; i++) {
			int prize = (int) (3 * Math.random());
			int choice = (int) (3 * Math.random());
			int reveal;
			do {
				reveal = (int) (3 * Math.random());
			} while((reveal == choice) || (reveal == prize));
			
			int other = 3 - reveal - choice;
			wins += other == prize ? 1 : 0;
		}
		System.out.println("Winning rate: " + 1.0 * wins / trials);

	}

}
