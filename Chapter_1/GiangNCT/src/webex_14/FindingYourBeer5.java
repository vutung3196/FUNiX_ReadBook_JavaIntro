package webex_14;

// 5. Print the fraction of times that at least one among N guest gets their original beer
public class FindingYourBeer5 {

  public static void main(String[] args) {
    // Try 1000 times
    int TRIALS = 1000;
    // N guests
    // int guestNo = Integer.valueOf(args[0]);
    int guestNo = 500000;
    // create array
    int[] peopleId = new int[guestNo];
    int[] beerId = new int[guestNo];
    int count = 0;
    // initialize
    for (int i = 0; i < guestNo; i++) {
      peopleId[i] = i;
      beerId[i] = i;
    }
    // shuffle
    for (int turn = 0; turn < TRIALS; turn++) {
      for (int i = 0; i < guestNo; i++) {
        int seed = (int) (Math.random() * (i + 1));
        int tmp = beerId[seed];
        beerId[seed] = beerId[i];
        beerId[i] = tmp;
      }
      // compare
      for (int i = 0; i < guestNo; i++) {
        if (peopleId[i] == beerId[i]) {
          count++;
          break;
        }
      }
    }
    // display fraction
    System.out.println("Result: " + (double) count / guestNo);
  }

}
