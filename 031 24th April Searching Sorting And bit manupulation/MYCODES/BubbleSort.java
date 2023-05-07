/*
Bubble Sort :
Time Complexity : O(n^2)
Space Complexity : O(1)
*/

import java.util.Arrays;

public class BubbleSort {

  private static void bubbleSort(int[] arr) {
    boolean swapped = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          //swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 20, 50, 10, 12, 45, 67, 90 };
    bubbleSort(arr);
    System.out.println("Sorted Array : " + Arrays.toString(arr));
  }
}

/*
Output :
Sorted Array : [10, 12, 20, 45, 50, 67, 90]
*/
