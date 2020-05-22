package three;

public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W = Integer.parseInt(args[0]);

       /* if      (W <  75) System.out.println("No hurricane");
        else if (W <  96) System.out.println(" hurricane 1");      
        else if (W < 111) System.out.println(" hurricane 2");      
        else if (W < 131) System.out.println(" hurricane 3");      
        else if (W < 155) System.out.println(" hurricane 4");      
        else                      System.out.println(" hurricane 5"); 
	*/
		
		if 		(W > 155) System.out.println("Huricane 5");
		else if (W > 130) System.out.println("Huricane 4");
		else if (W > 110) System.out.println("Huricane 3");
		else if (W > 95)  System.out.println("Huricane 2");
		else if (W > 74)  System.out.println("Huricane 1");
		else 				System.out.println("No Huricane");
	}

}
