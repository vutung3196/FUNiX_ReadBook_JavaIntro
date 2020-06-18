package three;

public class Sort3 {

	public static void main(String[] args) {
		    int a = Integer.parseInt(args[0]);
	        int b = Integer.parseInt(args[1]);
	        int c = Integer.parseInt(args[2]);
	        int t;
	        
	        if (a < b) {
	        	t = b; b = a; a = t;
	        }
	        if (b < c) {
	        	t = c; c = b; b = t;
	        }
	        if (a < b) {
	        	t = b; b = a; a = t;
	        }
	        System.out.println(a + " " + b + " " + c);
	}

}
