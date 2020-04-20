package webex_12;
// 9. Alice writes down two integers between 0 and 100 on two cards. Bob gets to 
// select one of the two cards and see its value. After looking at the value, 
// Bob commits to one of the two cards. If he chooses a card with the largest value,
// he wins; otherwise he loses. Devise a strategy (and corresponding computer program)
// for Bob so that he guarantees to win strictly more than half the time.
public class GuessTheBiggestNumber {

	public static void main(String[] args) {
		// Uncomment lines with // test tail for test the winning rate
		// int countWin = 0; // test
		// for (int i = 0; i < 100; i++) {// test
			// Alice writes down 2 ints
			int first = (int) (Math.random() * 100);
			int second = (int) (Math.random() * 100);
			// Bob sees the 1st one, he chose the one >= 50
			boolean moreThan50 = first >= 50;
			System.out.println("Bob chose the 1st: " + moreThan50);
			boolean isWin = (moreThan50 && first > second) || (!moreThan50 && first < second);
			System.out.println("Bob is win: " + isWin);
			// if (isWin) countWin++; // test
			System.out.println("First: " + first + " | Second: " + second);
		// } // test
		// System.out.println("Winning rate: " + countWin/100.0); // test
	}

}
