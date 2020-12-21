package webex_14;

// 4. Determines whether or not a permutation corresponds to a placement of queens so that 
// no two are in the same row, column, or diagonal.
public class QueensChecker4 {

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    int[] array = new int[n];
    int TRIALS = 10000;
    for (int i = 0; i < n; i++) {
      array[i] = i;
    }
    
    // count turns until found the good permutation
    int count = 0;
    boolean isChecked = true;
    for (int i = 0; i < TRIALS && isChecked; i++) {
      // shuffle
      for (int j = 0; j < n; j++) {
        int random = (int) (Math.random() * (j + 1));
        int tmp = array[random];
        array[random] = array[j];
        array[j] = tmp;
      }
      
      isChecked = false;
      // check the permutation
      for (int j = 0; j < n && !isChecked; j++) {
        for (int k = 0; k < n; k++) {
          if (j != k && (array[j] == array[k] 
              || array[j] - array[k] == k - j || array[k] - array[j] == k -j)) {
            isChecked = true;
            break;
          }          
        }
      }
      count++;
    }
    // Display
    System.out.println("Check after: " + count);
    for (int i = 0; i < n; i++) {
      for (int num : array) {
        System.out.print(num == i ? "Q " : "* ");
      }
      System.out.println();
    }
  }

}
