package package12;

public class GuessTheBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int countWin = 0;
		 
		 for (int i = 0; i < 100; i++) {
		
			// writes down 2 ints
			int first = (int) (Math.random() * 100);
			int second = (int) (Math.random() * 100);
			
			// Bob sees the 1st one, he chose the one >= 50
			boolean moreThan50 = first >= 50;
			System.out.println("Bob chose the 1st: " + moreThan50);
		
			boolean isWin = (moreThan50 && first > second) || (!moreThan50 && first < second);
			System.out.println("Bob is win: " + isWin);
			
			if (isWin) countWin++;
			System.out.println("First: " + first + " | Second: " + second);
		 } 
		 
		 System.out.println("Winning rate: " + countWin/100.0);
	}

}
