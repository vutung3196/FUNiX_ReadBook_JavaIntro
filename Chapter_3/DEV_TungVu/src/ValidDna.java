public class ValidDna {
    public static void main(String[] args) {
        System.out.println(isValidDna(args[0]));
    }

    static boolean isValidDna(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != 'A' && c != 'T' && c != 'C' && c != 'G') {
                return false;
            }
        }
        return true;
    }
}
