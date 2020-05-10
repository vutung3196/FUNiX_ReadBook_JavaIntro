package com.anhvt.chapter1_3.reading;

/******************************************************************************
 *  Compilation:  javac HarmonicNumber.java
 *  Execution:    java HarmonicNumber n
 *
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 *
 *  % java HarmonicNumber 10
 *  2.9289682539682538
 *
 *  java HarmonicNumber 1000
 *  7.485470860550343
 *
 *  % java HarmonicNumber 10000
 *  9.787606036044348
 *
 ******************************************************************************/
public class HarmonicNumber {
    public static void main(String[] args) {
        harmonicNumber(10);
        harmonicNumber(1000);
        harmonicNumber(10000);
    }

    public static void harmonicNumber(int n) {
        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // print the nth harmonic number
        System.out.println(sum);
    }
}
