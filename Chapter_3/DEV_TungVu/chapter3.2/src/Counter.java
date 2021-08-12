
public class Counter implements Comparable<Counter> {
    private final String name;
    private final int maxCount;
    private int count;

    public Counter(String id, int max) {
        name = id;
        maxCount = max;
        count = 0;
    }

    public void increment() {
        if (count < maxCount) {
            count++;
        }
    }

    public int value() {
        return count;
    }

    @Override
    public int compareTo(Counter that) {
        if (this.count < that.count) {
            return -1;
        } else if (this.count == that.count) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int n  = 10;
        int trials = 10;
        Counter[] hits = new Counter[n];
        for (int i = 0; i < n; i++) {
            hits[i] = new Counter(i + "", trials);
        }

        for (int t = 0; t < trials; t++) {
            int index = StdRandom.uniform(n);
            hits[index].increment();
        }

        // print results
        for (int i = 0; i < n; i++) {
            StdOut.println(hits[i]);
        }
    }
}
