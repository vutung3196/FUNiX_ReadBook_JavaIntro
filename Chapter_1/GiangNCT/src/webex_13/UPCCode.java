package webex_13;

// 46. (d1 + d3 + d5 + d7 + d9 + d11) + 3 (d2 + d4 + d6 + d8 + d10 + d12)
// d1 so that the sum is a multiple of 10

public class UPCCode {

  public static void main(String[] args) {
    int[] arr = new int[12];
    
    for (int i = 1; i < 12; i++) {
      arr[i] = Integer.valueOf(args[i - 1]);
    }
        
    int sum = 0;
    for (int i = 1; i < 12; i++) {
      if (i % 2 == 0) {
        sum += 3 * arr[i];
      } else {
        sum += arr[i];
      }
    }
    arr[0] = 10 - sum % 10;
    for (int num : arr) {
      System.out.print(num);
    }
  }

}
