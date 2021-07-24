package com.chapter_43;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> operators = new Stack<>();
        Stack<Double> values = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "(":
                    break;
                case "+":
                    operators.push(s);
                    break;
                case "-":
                    operators.push(s);
                    break;
                case "*":
                    operators.push(s);
                    break;
                case "/":
                    operators.push(s);
                    break;
                case "sqrt":
                    operators.push(s);
                    break;
                case ")":
                    String operator = operators.pop();
                    double value = values.pop();
                    if (operator.equals("+")) value = values.pop() + value;
                    else if (operator.equals("-")) value = values.pop() - value;
                    else if (operator.equals("*")) value = values.pop() * value;
                    else if (operator.equals("/")) value = values.pop() / value;
                    else if (operator.equals("sqrt")) value = Math.sqrt(value);
                    values.push(value);
                    break;
                default:
                    values.push(Double.parseDouble(s));
                    break;
            }
        }
        StdOut.println(values.pop());
    }
}
