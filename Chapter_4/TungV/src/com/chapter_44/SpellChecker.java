package com.chapter_44;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.SET;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class SpellChecker {
    public static void main(String[] args) {
        SET<String> dictionary = new SET<>();

        // read in dictionary of words
        In dict = new In(args[0]);
        while (!dict.isEmpty()) {
            String word = dict.readString();
            dictionary.add(word);
        }
        StdOut.println("Enter words, and I'll print out the misspelled ones");
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            if (!dictionary.contains(word)) StdOut.println(word);
        }
    }
}
