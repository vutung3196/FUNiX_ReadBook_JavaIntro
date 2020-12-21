package recursive_bonus;

public class CountVowel {
  static final String VOWELS = "aieuoAIEUO";
  
  public static void main(String[] args) {
    String hello = "Hello World!";
    System.out.println(countVowelLoop(hello));
    System.out.println(countVowelRecursion(hello, 0));
    System.out.println(betterCount(hello));
  }

  static int countVowelLoop(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); ++i) {
      count += VOWELS.contains(Character.toString(str.charAt(i))) ? 1 : 0;
    }
    return count;
  }
  
  static int countVowelRecursion(String str, int index) {
    if (index == str.length() - 1) {
      return VOWELS.contains(Character.toString(str.charAt(index))) ? 1 : 0;
    }
    return (VOWELS.contains(Character.toString(str.charAt(index))) ? 1 : 0)
        + countVowelRecursion(str, index + 1);
  }
  
  static int betterCount(String str) {
    if (str.length() == 0) {
      return 0;
    }
    return (VOWELS.contains(Character.toString(str.charAt(str.length() - 1))) ? 1 : 0)
        + betterCount(str.substring(0, str.length() - 1));
  }
}
