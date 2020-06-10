package three;

public class LoadedDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// b1:nguoi choi 1 chon ngau nhien chon A B C, nguoi thu 2 chon tuong ung		
		int[][] dice = {{ 3, 4, 8}, { 2, 6, 7}, { 1, 5 , 9}, { 3, 4, 8}};
		int first;
		int second;
		int win = 0;			
		for (int i = 1; i <= 1000; i++) {
			int j = (int) (Math.random() * 3) + 1;	
			int k = (int) (Math.random() * 3);
			first = dice[j][k];
			k = (int) (Math.random() * 3);
			second = dice[j-1][k];				
			if (second > first) {
					win++;
			}			
		}			
		System.out.println(win);
		System.out.println(1.0 * win / (1000 - win));		
	}
}
