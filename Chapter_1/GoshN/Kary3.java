
public class Kary3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int i = Integer.parseInt(args[1]);
		
		String s ="";
		
		for (int k = n; k > 0; k /=i) {
			s = (k % i) + s;
		}
		System.out.println(s);
	}

}
