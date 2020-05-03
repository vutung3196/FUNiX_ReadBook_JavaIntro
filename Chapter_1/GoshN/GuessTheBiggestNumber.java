
public class GuessTheBiggestNumber {


	public static void main(String[] args) {
	int first = Integer.parseInt(args[0]);
	int second = Integer.parseInt(args[1]);
	
	boolean BobChose = first >= 50;
	boolean win = (second <= first && BobChose) 
			|| (second >= first && !BobChose);
			
	
	System.out.println("Bob chose the first =" + BobChose);
	System.out.println("Bob is win =" + win);
	System.out.println("first number is " + first + "," + "second number is " + second);

	}

}
