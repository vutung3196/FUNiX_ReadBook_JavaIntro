package com.chapter_43;

public class Reverse {
    private static class Node {
        public int data;
        public Node next;
    }

    public static Node reverse(Node first) {
        if (first == null || first.next == null) return first;
        Node reverse = null;
        while (first != null) {
            Node second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }
        return reverse;
    }

    public static void main(String[] args) {
    }
}
