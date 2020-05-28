package three;

public class BoyAndGirl {

	public static void main(String[] args) {
		int trials = Integer.parseInt(args[0]);
		int i = 0 ;
		int j = 0 ;
		int k =1;
		double c = Math.random();
		double d = Math.random();
		
		for (int t = 0; t < trials; t++) {
			if (Math.random() > 0.5)
				i++;
			
			

			else 
				j++;

			
		 }
		 System.out.println(i);
		 System.out.println(j);

		
		/*int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
        */
	}

}
