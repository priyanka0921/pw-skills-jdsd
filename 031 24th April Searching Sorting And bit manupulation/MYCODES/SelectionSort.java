/*
Selection Sort :
Time Complexity : O(n^2)
Space Complexity : O(1)
*/
/*
 * 1. At every iteration we get smaller element in extream left.
 */

import java.util.Arrays;

public class SelectionSort {

  private static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      // min_idx taking the index of minimum element in every iteration
      int min_idx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
      }
      if (min_idx != i) {
        // swap between arr[min_idx] and arr[i]
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 20, 50, 10, 12, 45, 67, 90 };
    // Function Calling
    selectionSort(arr);
    System.out.println("Sorted Array : " + Arrays.toString(arr));
  }
}
/*
 Output :
 Sorted Array : [10, 12, 20, 45, 50, 67, 90]
 */
