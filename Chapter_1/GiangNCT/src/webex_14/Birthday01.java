package webex_14;

// 01. Computes the probability that two people have a birthday within a day of each other. 
public class Birthday01 {
  public static void main(String[] args) {
    int trials = 10000;
    int count = 0;
    for (int i = 0; i < trials; i++) {
      int day1 = (int) (364 * Math.random());
      int day2 = (int) (364 * Math.random());
      count += (day1 == day2) ? 1 : 0;
    }
    System.out.println("Probability: " + (double) count / trials);

  }

}
