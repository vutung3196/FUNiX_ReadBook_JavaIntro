package recursive_bonus;

import java.util.Stack;

public class WaysToClimb {

  public static void main(String[] args) {
    int stairs = 4;
    Stack<Integer> steps = new Stack<Integer>();
    waysToClimb(stairs, steps);
  }
  
  static void waysToClimb(int n, Stack<Integer> steps) {
    if (n <= 0) {
      return;
    }
    if (n == 1) {
      steps.push(1);
      System.out.println(steps);
      steps.pop(); return;
    }
    if (n == 2) {
      steps.push(2);
      System.out.println(steps);
      steps.pop();
    }
    steps.push(1);
    waysToClimb(n - 1, steps);
    steps.pop();
    steps.push(2);
    waysToClimb(n - 2, steps);
    steps.pop();
  }

}
