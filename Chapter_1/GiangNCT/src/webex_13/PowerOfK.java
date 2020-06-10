package webex_13;

// 82. takes an integer K as command-line argument and prints all the positive powers of K in the Java long data type
public class PowerOfK {

  public static void main(String[] args) {
    //int k = Integer.valueOf(args[0]);
    int k = 5;
    long power = 0;
    while(Math.pow(k, power) < Long.MAX_VALUE) {
      System.out.printf("k: %d\t\tpower: %d\t\tresult: %d\n", k, power, (long) Math.pow(k, power));
      power++;
    }
  }

}
