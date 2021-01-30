public class Kamasucha {
    public static void main(String[] args) {
        // THEQUICKBROWN FXJMPSVLAZYDG
        String top = "THEQUICKBROWN";
        String bot = "FXJMPSVLAZYDG";

        while (StdIn.hasNextLine()) {
            String s = StdIn.readLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if      (top.indexOf(c) >= 0) StdOut.print(bot.charAt(top.indexOf(c)));
                else if (bot.indexOf(c) >= 0) StdOut.print(top.charAt(bot.indexOf(c)));
                else                          StdOut.print(c);
            }
            StdOut.println();
        }
    }
}
