
public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
        System.out.println(sum);
	}

}
