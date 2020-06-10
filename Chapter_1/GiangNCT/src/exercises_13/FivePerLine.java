package exercises_13;

// 9. Prints the integers from 1000 to 2000 with five integers per line. 
public class FivePerLine {

	public static void main(String[] args) {
		for (int i = 1000; i <= 2000; i++) {
			System.out.print(i);
			if (i % 5 == 4) System.out.println();
			else System.out.print(" ");
		}

	}

}
