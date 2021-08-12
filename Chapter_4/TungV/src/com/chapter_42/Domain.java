package com.chapter_42;

import java.util.Arrays;

public class Domain implements Comparable<Domain> {
    private final String[] fields;
    private final int size;

    // store fields in reverse order
    public Domain(String name) {
        fields = name.split("\\.");
        size = fields.length;
    }

    public String toString() {
        if (size == 0) return "";
        String result = fields[0];
        for (int i = 1; i < size; i++) {
            result = fields[i] + "." + result;
        }
        return result;
    }

    @Override
    public int compareTo(Domain that) {
        for (int i = 0; i < Math.min(this.size, that.size); i++) {
            String firstString = this.fields[this.size - i - 1];
            String secondString = that.fields[that.size - i - 1];
            int compare = firstString.compareTo(secondString);
            if      (compare < 0) return -1;
            else if (compare > 0) return +1;
        }
        return this.size - that.size;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"com.apple", "com.cnn", "com.google", "edu.princeton"};
        Domain[] domains = new Domain[names.length];
        for (int i = 0; i < domains.length; i++) {
            domains[i] = new Domain(names[i]);
        }

        // sort
        Arrays.sort(domains);

        // print results
        for (int i = 0; i < domains.length; i++) {
            System.out.println(domains[i]);
        }
    }
}
