package com.chapter_42;

import java.util.Arrays;

public class Dedup {
    private static void dedup(String[] inputs) {
        Arrays.sort(inputs);
        for (int i = 0; i < inputs.length; i++) {
            if (i == 0 || !inputs[i].equals(inputs[i-1]))
                System.out.println(inputs[i]);
        }
    }

    public static void main(String[] args) {
        var inputs = new String[] {"a", "a", "b", "c", "d", "c", "e"};
        dedup(inputs);
    }

    private static void insertionSort(String[] inputs) {
        for (int i = 1; i < inputs.length; i++) {
            for (int j = i; j > 0; j--) {
                if (inputs[j-1].compareTo(inputs[j]) > 0) {
                    var temp = inputs[j-1];
                    inputs[j-1] = inputs[j];
                    inputs[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
