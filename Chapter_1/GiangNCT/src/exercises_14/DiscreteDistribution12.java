package exercises_14;

// 12. takes a variable number of integer command-line arguments
// and prints the integer i with probability proportional to the ith command-line argument.
public class DiscreteDistribution12 {

  public static void main(String[] args) {
    int n = args.length;
    int[] frequency = new int[n];
    for (int i = 0; i < n; i++) {
      frequency[i] = Integer.valueOf(args[i]);
    }
    
    int sum = 0;
    for (int freq : frequency) {
      sum += freq;
    }
    
    int random = (int) (sum * Math.random());
    int sumRandom = 0;
    int event = -1;
    for (int i = 0; i < n && sumRandom <= random; i++) {
      sumRandom += frequency[i];
      event = i;
    }
    System.out.println(event);
  }

}
