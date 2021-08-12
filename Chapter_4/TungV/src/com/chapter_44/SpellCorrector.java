package com.chapter_44;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdOut;

public class SpellCorrector {
    public static void main(String[] args) {
        ST<String, String> st = new ST<>();
        In in1 = new In(args[0]);
        while (in1.hasNextLine()) {
            String word       = in1.readString();
            String correction = in1.readLine().trim();
            st.put(word, correction);
        }

        In in2 = new In(args[1]);
        while (in2.hasNextLine()) {
            String line = in2.readLine().trim();
            String[] words = line.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                if (st.contains(words[i])) StdOut.print(st.get(words[i]));
                else                       StdOut.print(words[i]);
                if (i < words.length - 1)  StdOut.print(" ");
            }
            StdOut.println();
        }
    }
}
