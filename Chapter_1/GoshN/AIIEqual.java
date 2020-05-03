
public class AIIEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && a == c) {
            System.out.println("all equal");
        }
        else {
            System.out.println("not all equal");
        }
	}

}
