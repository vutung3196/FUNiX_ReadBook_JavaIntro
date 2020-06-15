package three;

public class season {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		System.out.println("date " + day + "/" + month + " is :");
		if(month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("does not exist");
		}
		else {
		 switch (month) {
		 	  case 3:
		        if (day <= 20) System.out.println("Winter");
		        else System.out.println("Spring"); 
		        break;
		      case 4: case 5:
		        System.out.println("Spring"); 
		        break;
		      case 6:
		        if (day <= 20) System.out.println("Spring");
		        else System.out.println("Summer");
		        break;
		      case 7: case 8:
		        System.out.println("Summer"); 
		        break;
		      case 9:
		        if (day <= 22) System.out.println("Summer");
		        else System.out.println("Fall");
		        break;
		      case 10: case 11:
		        System.out.println("Fall"); 
		        break;
		      case 12:
		        if (day <= 21) System.out.println("Fall");
		        else System.out.println("Winter");
		      default:
		      System.out.println("Winter"); 
		        break;
		    }    
		}
	}
}
