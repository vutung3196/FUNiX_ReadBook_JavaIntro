package webex_13;

// 69. h(t) = -0.12t4 - 12t3 - 380t2 + 4760t + 220
// Org: h(t) = 0.12t4 + 12t3 - 380t2 + 4100t + 220
// Org: h(t) = 0.12t4 + 12t3 - 380t2 + 2840t + 220
// Create a table of the height at time t for t = 0 to 48. What is its maximum height?
public class WeatherBaloon {

  public static void main(String[] args) {
    double max = Double.MIN_VALUE;
    int maxt = 0;
    for (int t = 0; t < 49; t++) {
      double h = -0.12 * Math.pow(t, 4) - 12 * Math.pow(t, 3) - 380 * Math.pow(t, 2) + 4760 * t + 220;
      // double h = 0.12 * Math.pow(t, 4) + 12 * Math.pow(t, 3) - 380 * Math.pow(t, 2) + 2840 * t + 220;
      System.out.printf("t: %d\t\th: %.2f\n", t, h);
      if (max < h) {max = h; maxt = t;}
    }
    System.out.printf("Max t: %d\t\t Max h: %.2f", maxt, max);
  }

}
