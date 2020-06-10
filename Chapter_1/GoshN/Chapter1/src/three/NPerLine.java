package three;

public class NPerLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in ra moi hang n so tong m hang
		int row = Integer.parseInt(args[0]);
		for (int i = 1; i <1000; i++) {
			if (i % row != 0) {
				if(i < 10) {
					System.out.print(i +  ",   ");	
				}
				else if (i < 100) {
					System.out.print(i +  ",  ");
				}
				else
					System.out.print(i + ", ");
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println(1000);		
	}

}
