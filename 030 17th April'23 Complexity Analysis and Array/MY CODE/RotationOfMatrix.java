// rotation of 2d matrix by 90 deg
// time complexity : O(m*n)
// space complexity : O(1)

import java.util.Arrays;

public class RotationOfMatrix {

  private static void rotetedMatrix(int[][] arr) {
    // step 1 : transpose the 2d array
    int m = arr.length;
    int n = arr[0].length;

    for (int i = 0; i < m; i++) {
      for (int j = i; j < n; j++) { // important : (why j = i in the inner loop ?)
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    System.out.println("Transposed Array : ");
    for (var mat : arr) {
      System.out.println(Arrays.toString(mat));
    }
    System.out.println();

    // step 2 : swap the left and write side of the array
    for (int i = 0; i < m; i++) {
      int li = 0;
      int ri = n - 1;

      while (li < ri) {
        int temp = arr[i][li];
        arr[i][li] = arr[i][ri];
        arr[i][ri] = temp;
        li++;
        ri--;
      }
    }

    System.out.println("90 deg Roteted Array : ");
    for (var mat : arr) {
      System.out.println(Arrays.toString(mat));
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[][] arr = {
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };

    System.out.println("Original Array : ");
    for (var mat : arr) {
      System.out.println(Arrays.toString(mat));
    }
    System.out.println();

    rotetedMatrix(arr);
  }
}
