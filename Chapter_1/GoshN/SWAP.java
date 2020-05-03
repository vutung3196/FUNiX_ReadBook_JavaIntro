
public class SWAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = 0;
        System.out.println("a = " + a + ", b = " + b);
        t = a;
        a = b;
        b = t;
        System.out.println("a = " + a + ", b = " + b);
	}

}
