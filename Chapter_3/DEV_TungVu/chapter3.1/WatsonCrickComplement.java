public class WatsonCrickComplement {
    public static void main(String[] args) {
        System.out.println(complementWatsonCrickComplement("ATTTTTCGGGGGGGG"));
    }

    static String complementWatsonCrickComplement(String input) {
        // replace A with T, C with G, and vice versa.
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'A') {
                charArray[i] = 'T';
                continue;
            }
            if (charArray[i] == 'C') {
                charArray[i] = 'G';
                continue;
            }
            if (charArray[i] == 'T') {
                charArray[i] = 'A';
                continue;
            }
            if (charArray[i] == 'G') {
                charArray[i] = 'C';
                continue;
            }
        }
        return new String(charArray);
    }
}
