package package14;

public class SelfWalk {

	public static void main(String[] args) {
		/*
		int n = Integer.valueOf(args[0]);
		int trials = Integer.valueOf(args[1]);
		*/
		int n = 10;
		int trials = 1000000;
		int deadEnds = 0;
		
		for (int i = 0; i < trials; i++) {
			int x = n / 2, y = n / 2;
			boolean[][] a = new boolean[n][n];
			while (x > 0 && x < n - 1 && y > 0 && y < n - 1) {
				if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
					deadEnds++;
					break;
				}
				
				a[x][y] = true;
				double random = Math.random();
				if (random < 0.25) {
					if (!a[x+1][y])
						x++;
				} else if (random < 0.5) {
					if (!a[x-1][y])
						x--;
				} else if (random < 0.75) {
					if (!a[x][y+1])
						y++;
				} else {
					if (!a[x][y-1])
						y--;
				}
			}	
		}
		System.out.println("Dead ends: " + 100.0 * deadEnds / trials + "%");

	}

}
