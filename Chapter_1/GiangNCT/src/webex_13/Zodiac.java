package webex_13;

// 56. prints the Zodiac sign corresponding to month M (1 = January, 12 = December) and day D
public class Zodiac {

  public static void main(String[] args) {
    /*
     * int month = Integer.valueOf(args[0]);
     * int day = Integer.valueOf(args[1]);
     */
    int month = 5, day = 25;
    switch (month) {
      case 1:
        System.out.println(day > 19 ? "Aquarius" : "Capricorn"); break;
      case 2:
        System.out.println(day > 17 ? "Pisces" : "Capricorn"); break;
      case 3:
        System.out.println(day > 19 ? "Aries" : "Pisces"); break;
      case 4:
        System.out.println(day > 19 ? "Taurus" : "Aries"); break;
      case 5:
        System.out.println(day > 20 ? "Gemini" : "Taurus"); break;
      case 6:
        System.out.println(day > 20 ? "Cancer" : "Gemini"); break;
      case 7:
        System.out.println(day > 22 ? "Leo" : "Cancer"); break;
      case 8:
        System.out.println(day > 22 ? "Virgo" : "Leo"); break;
      case 9:
        System.out.println(day > 22 ? "Libra" : "Virgo"); break;
      case 10:
        System.out.println(day > 22 ? "Scorpio" : "Libra"); break;
      case 11:
        System.out.println(day > 21 ? "Sagittarius" : "Scorpio"); break;
      case 12:
        System.out.println(day > 22 ? "Capricorn" : "Sagittarius"); break;
      default:
        break;
    }
  }
}
