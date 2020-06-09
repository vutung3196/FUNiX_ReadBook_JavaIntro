package webex_13;

// 48. reads in a command line integer N (number of pennies) and prints the best way (fewest number of coins) 
// to make change using US coins (quarters, dimes, nickels, and pennies only).
public class MakingChange {

  public static void main(String[] args) {
    // int cents = Integer.valueOf(args[0]);
    int cents = 80;
    int quarters = cents / 25;
    cents -= quarters * 25;
    int dimes = cents / 10;
    cents -= dimes * 10;
    int nickels = cents / 5;
    cents -= nickels * 5;
    int pennies = cents;
    // quarters display
    switch (quarters) {
      case 0:
        break;
      case 1:
        System.out.println("1 quarter"); break;
      default:
        System.out.println(quarters + " quarters"); break;
    }
    // dimes display
    switch (dimes) {
      case 1:
        System.out.println("1 dime"); break;
      case 0:
        break;
      default:
        System.out.println(dimes + " dimes"); break;
    }
    // nickels display
    switch (nickels) {
      case 1:
        System.out.println("1 nickle"); break;
      case 0:
        break;
      default:
        System.out.println(dimes + " nickles"); break;
    }
    // pennies
    switch (pennies) {
      case 1:
        System.out.println("1 penny"); break;
      case 0:
        break;
      default:
        System.out.println(pennies + " pennies"); break;
    }
  }

}
