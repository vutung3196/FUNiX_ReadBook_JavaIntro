package com.chapter_42;

public class Domain implements Comparable<Domain> {
    private final String[] fields;
    private final int n;

    // store fields in reverse order
    public Domain(String name) {
        fields = name.split("\\.");
        n = fields.length;
    }

    public String toString() {
        if (n == 0) return "";
        String s = fields[0];
        for (int i = 1; i < n; i++) {
            s = fields[i] + "." + s;
        }
        return s;
    }

    @Override
    public int compareTo(Domain that) {
        for (int i = 0; i < Math.min(this.n, that.n); i++) {
            String s = this.fields[this.n - i - 1];
            String t = that.fields[that.n - i - 1];
            int c = s.compareTo(t);
            if      (c < 0) return -1;
            else if (c > 0) return +1;
        }
        return this.n - that.n;
    }

    public static void main(String[] args) {

    }
}
