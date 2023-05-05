// Prefix Sum of an array
// time complexity : O(m*n)
// space complexity : O(1)

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {

  public static int findSumMatrix(int[][] arr, int r1, int c1, int r2, int c2) {
    int sum = 0;
    for (int i = r1; i <= r2; i++) {
      for (int j = c1; j <= c2; j++) {
        sum += arr[i][j];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    // taking 2d array input
    Scanner sc = new Scanner(System.in);
    System.out.print("No of row : ");
    int r = sc.nextInt();
    System.out.print("No of coloum : ");
    int c = sc.nextInt();
    int[][] arr = new int[r][c];
    System.out.println("Input " + (r * c) + " no of elements : ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("Original Array : ");
    for (var mat : arr) {
      System.out.println(Arrays.toString(mat));
    }
    System.out.println("----------------------------");
    // taking 2d array input

    System.out.print("r1 : ");
    int r1 = sc.nextInt();
    System.out.print("c1 : ");
    int c1 = sc.nextInt();
    System.out.print("r2 : ");
    int r2 = sc.nextInt();
    System.out.print("c2 : ");
    int c2 = sc.nextInt();


    System.out.println("Sum of Matrix : " + findSumMatrix(arr, r1, c1, r2, c2));

    sc.close();

  }
}
