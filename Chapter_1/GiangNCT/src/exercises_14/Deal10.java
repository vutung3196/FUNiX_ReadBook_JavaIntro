package exercises_14;

// 10. takes an integer command-line argument n 
// and prints n poker hands (five cards each) from a shuffled deck, separated by blank lines.
public class Deal10 {

  public static void main(String[] args) {
    int CARDS_NUMBER = 5;
    // int PLAYERS = Integer.valueOf(args[0]);
    int PLAYERS = 3;
    String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"
    };
    String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
    };
    int n = SUITS.length * RANKS.length;
    
    if (CARDS_NUMBER * PLAYERS > n)
      throw new RuntimeException("Too many players");
    
    // initialize
    String[] deck = new String[n];
    for (int i = 0; i < RANKS.length; i++) {
      for (int j = 0; j < SUITS.length; j++) {
        deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
      }
    }
    
    // shuffle
    for (int i = 0; i < n; i++) {
      int r = i + (int) (Math.random() * (n - i));
      String tmp = deck[r];
      deck[r] = deck[i];
      deck[i] = tmp;
    }
    
    // display
    for (int i = 0; i < PLAYERS * CARDS_NUMBER; i++) {
      System.out.println(deck[i]);
      if (i % CARDS_NUMBER == CARDS_NUMBER - 1)
        System.out.println();
    }
  }

}
