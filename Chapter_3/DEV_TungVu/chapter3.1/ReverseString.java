public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseFromAuthor("abc"));
        System.out.println(reverseFromAuthor("def"));
        System.out.println(reverseFromAuthor("aaa"));
        System.out.println(reverseFromAuthor("123"));
        System.out.println(reverseFromAuthor("456"));
    }

    static String reverse(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }

    // From author's solution
    static String reverseFromAuthor(String input) {
        int n = input.length();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[n - i - 1];
            charArray[n - i - 1] = temp;
        }
        return new String(charArray);
    }
}
