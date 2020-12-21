package recursive_bonus;

public class ReversedString {

  public static void main(String[] args) {
    String hello = "Hello World!";
    System.out.println(reverseLoop(hello));
    System.out.println(reverseRecursion(hello, hello.length() - 1));
    System.out.println(betterRecursion(hello));
  }

  static String reverseLoop(String str) {
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; --i) {
      reversed += str.charAt(i);
    }
    return reversed;
  }
  
  static String reverseRecursion(String str, int index) {
    if (index == 0) {
      return Character.toString(str.charAt(index));
    }
    return Character.toString(str.charAt(index))
        + reverseRecursion(str, index - 1); 
  }
  
  static String betterRecursion(String str) {
    if (str.length() <= 1) {
      return str;
    }
    return str.charAt(str.length() - 1) + betterRecursion(str.substring(0, str.length() - 1));
  }
}
