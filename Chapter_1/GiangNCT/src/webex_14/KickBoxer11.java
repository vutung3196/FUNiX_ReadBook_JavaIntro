package webex_14;

// 11. takes an integer weight w as a command line input 
// and prints the corresponding kickboxing weight-class according to the table
public class KickBoxer11 {

  public static void main(String[] args) {
    int weight = Integer.valueOf(args[0]);
    int[] weights = {
        112, 115, 118, 122, 126, 130, 135, 140, 147, 154, 160, 167, 174, 183, 189, 198, 209, 9999
    };
    
    String[] categories = {"Fly Weight", "Super Fly Weight", "Bantam Weight", "Super Bantam Weight",
        "Feather Weight", "Super Feather Weight", "Light Weight", "Super Light Weight", "Welter Weight",
        "Super Welter Weight", "Middle Weight", "Super Middle Weight", "Light Heavy Weight", "Super Light"
        + "Heavy Weight", "Cruiser Weight", "Super Cruiser Weight", "Heavy Weight", "Super Heavy Weight"};
    
    for (int i = 0; i < weights.length; i++) {
      if (weight < weights[i]) {
        System.out.println(categories[i]);
        break;
      }
    }

  }

}
