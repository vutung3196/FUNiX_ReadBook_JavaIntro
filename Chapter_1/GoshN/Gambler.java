
public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double stake  = Double.parseDouble(args[0]);    // gambler's stating bankroll
	        double goal   = Double.parseDouble(args[1]);    // gambler's desired bankroll
	        int trials = Integer.parseInt(args[2]);    // number of trials to perform

	        int bets = 0;        // total number of bets made
	        int wins = 0;        // total number of games won

	        // repeat trials times
	        for (int t = 0; t < trials; t++) {

	            // do one gambler's ruin simulation
	            double cash = stake;
	            while (cash > 0 && cash < goal) {
	                bets++;
	                if (Math.random() < 0.5) cash = cash + 1;     // win $1
	                else                     cash = cash - 1.15;     // lose $1
	            }
	            if (cash == goal) wins++;                // did gambler go achieve desired goal?
	        }

	        // print results
	        System.out.println(wins + " wins of " + trials);
	        System.out.println("Percent of games won = " + 100.0 * wins / trials);
	        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	}

}
