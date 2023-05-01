// reverse an array
// time complexity O(n)
// space complexity O(1)

import java.util.Arrays;

public class ReverseArray_2 {

  public static void main(String[] args) {
    int arr[] = { 14, 12, 10, 8, 4, 2 };
    System.out.println("Original Array : " + Arrays.toString(arr));

    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }

    System.out.println("Reversed Array : " + Arrays.toString(arr));
  }
}
