package webex_13;

// 41 & 42. Suppose a, b, and c are random number uniformly distributed between 0 and 1.
// What is the probability that a, b, and c form the side length of some triangle?
// Repeat the previous question, but calculate the probability that the resulting triangle is obtuse
public class TriangleFormProbability {

  public static void main(String[] args) {
    int trials = 1000;
    int trianglesCount = 0;
    int obtuseCount = 0;
    for (int i = 0; i < trials; i++) {
      double a = Math.random();
      double b = Math.random();
      double c = Math.random();
      double sum = a + b + c;
      double max = Math.max(a, Math.max(b, c));
      double min = Math.min(a, Math.min(b, c));
      if ( sum - max > max) {
        trianglesCount++;
        if (Math.pow(sum - max - min, 2) + Math.pow(min, 2) > Math.pow(max, 2)) {
          obtuseCount++;
        }
      }
    }
    System.out.println("Triangle probability: " + trianglesCount / 1000.0);
    System.out.println("Obtuse probability: " + obtuseCount / 1000.0);
  }

}
