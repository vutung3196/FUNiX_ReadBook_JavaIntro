package com.chapter_42;

public class IntegerSort {
    public static void main(String[] args) {
        int MAX = 100;
        int[] freq = new int[MAX];
        int[] input = new int[]
        { 98, 2, 3, 1, 0, 0, 0, 3, 98, 98, 2, 2, 2, 0, 0, 0, 2 };
        for (int a: input) {
            freq[a]++;
        }

        // using frequency
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < freq[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
