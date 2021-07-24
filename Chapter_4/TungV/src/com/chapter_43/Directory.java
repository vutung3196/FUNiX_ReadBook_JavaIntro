package com.chapter_43;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;

public class Directory {
    public static void main(String[] args) {
        Queue<File> queue = new Queue<>();
        File root = new File(args[0]);
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            var currentFile = queue.dequeue();
            var files = currentFile.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) queue.enqueue(files[i]);
                    else StdOut.println(files[i].length() + ":\t" + files[i]);
                }
            }
        }
    }
}
