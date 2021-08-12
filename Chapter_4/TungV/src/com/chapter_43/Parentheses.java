package com.chapter_43;

import edu.princeton.cs.algs4.Stack;

public class Parentheses {
    private static final char L_PAREN    = '(';
    private static final char R_PAREN    = ')';
    private static final char L_BRACE    = '{';
    private static final char R_BRACE    = '}';
    private static final char L_BRACKET  = '[';
    private static final char R_BRACKET  = ']';

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == L_PAREN) stack.push(L_PAREN);
            else if (input.charAt(i) == L_BRACE) stack.push(L_BRACE);
            else if (input.charAt(i) == L_BRACKET) stack.push(L_BRACKET);
            else if (input.charAt(i) == R_PAREN) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != L_PAREN) return false;
            }
            else if (input.charAt(i) == R_BRACE) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != L_BRACE) return false;
            }
            else if (input.charAt(i) == R_BRACKET) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != L_BRACKET) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("[()]{}{[()()]()}}}"));
    }
}
