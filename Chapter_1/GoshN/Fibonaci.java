
public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
        int f = 0, g = 1;

        for (int i = 1; i <= n; i++) {
            f = f + g;
            g = f - g;
            System.out.println(f); 
        }
	}

}
