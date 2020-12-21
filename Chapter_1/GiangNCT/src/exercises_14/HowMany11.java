package exercises_14;

// 11. takes a variable number of command-line arguments and prints how many there are.
public class HowMany11 {

  public static void main(String[] args) {
    System.out.println("There are " + args.length + " argument" + (args.length > 1 ? "s." : "."));
  }

}
