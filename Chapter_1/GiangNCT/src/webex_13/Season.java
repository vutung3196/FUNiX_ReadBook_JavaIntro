package webex_13;

// 55. prints the season corresponding to month M (1 = January, 12 = December) and day D in the northern hemisphere
public class Season {

  public static void main(String[] args) {
    /*
    int month = Integer.valueOf(args[0]);
    int day = Integer.valueOf(args[1]);
    */
    int month = 5;
    int day = 25;
    switch (month) {
      case 1: case 2:
        System.out.println("Winter"); break;
      case 3:
        if (day <= 20) System.out.println("Winter");
        else System.out.println("Spring"); 
        break;
      case 4: case 5:
        System.out.println("Spring"); break;
      case 6:
        if (day <= 20) System.out.println("Spring");
        else System.out.println("Summer");
        break;
      case 7: case 8:
        System.out.println("Summer"); break;
      case 9:
        if (day <= 22) System.out.println("Summer");
        else System.out.println("Fall");
        break;
      case 10: case 11:
        System.out.println("Fall"); break;
      case 12:
        if (day <= 21) System.out.println("Fall");
        else System.out.println("Winter");
      default:
        break;
    }
  }

}
