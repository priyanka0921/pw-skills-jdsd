/*
Insertion Sort :
Time Complexity : O(n^2)
Space Complexity : O(1)
*/

/*
 * 1. When array is almost or fully sorted then we will use Insertion sort then the time complexity will be O(n).
 * 2. It is a stable sorting algoritm.
 */

import java.util.Arrays;

public class InsertionSort {

  private static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j - 1]) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 20, 50, 10, 12, 45, 67, 90 };
    // Function Calling
    insertionSort(arr);
    System.out.println("Sorted Array : " + Arrays.toString(arr));
  }
}
/*
Output :
Sorted Array : [10, 12, 20, 45, 50, 67, 90]
*/
