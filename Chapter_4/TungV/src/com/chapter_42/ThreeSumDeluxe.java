package com.chapter_42;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumDeluxe {
    /**
     * Time complexity O(n^2 * log(n))
     *
     * @param arr
     * @return
     */
    private static int count(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int searchElement = -(arr[i] + arr[j]);
                int k = Arrays.binarySearch(arr, searchElement);
                if (k >= 0 && k > j) count++;
            }
        }
        List<List<Integer>> a = new ArrayList<>();
        a.add(new ArrayList(Arrays.asList(1, 2, 3)));
        return count;
    }

    public static void printAll(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k >= 0 && k > j) {
                    StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        var nums = new int[]{-1, 0, 1, 2, -1, -4};
        printAll(nums);
    }
}
