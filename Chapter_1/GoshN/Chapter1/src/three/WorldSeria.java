package three;

public class WorldSeria {

	public static void main(String[] args) {
		 int trial = 1000;
		    int games = 0, win = 0;
		    for (int i = 0; i < trial; i++) {
		      int first = 0, second = 0;
		      for (int j = 0; j < 7; j++) {
		        double res = Math.random();
		        if (res < 0.40) second++;
		        else first++;
		        if (first == 4 || second == 4) {
		          games += j;
		          if (second == 4) win++;
		          break;
		        }
		      }
		    }
		    System.out.println("Chances to win: " + win / 1000.0);
		    System.out.println("Average games: " + games / 1000.0);

	}

}
