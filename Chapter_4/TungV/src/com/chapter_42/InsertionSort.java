package com.chapter_42;

public class InsertionSort {

    public static void sort(String[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j-1].compareTo(a[j]) > 0)
                    exch(a, j, j-1);
                else break;
            }
        }
    }

    private static void exch(String[] a, int j, int i) {
        var temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
