package exercises_14;

// 38. Suppose that people enter an empty room until a pair of people share a birthday.
// On average, how many people will have to enter before there is a match?
public class Birthdays38 {

  public static void main(String[] args) {
    int days = Integer.valueOf(args[0]);
    int trials = Integer.valueOf(args[1]);
    // total number of people over all trials
    int totalPeople = 0;
    
    for (int t = 0; t < trials; t++) {
      boolean[] hasBirthday = new boolean[days];
      
      while(true) {
        totalPeople++;
        int d = (int) (days * Math.random());
        if (hasBirthday[d]) break;
        hasBirthday[d] = true;
      }
    }
    double avg = (double) totalPeople / trials;
    System.out.println("Average = " + avg);
  }

}
