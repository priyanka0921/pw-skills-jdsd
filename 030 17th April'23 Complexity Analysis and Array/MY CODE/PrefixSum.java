// Prefix Sum of 2d array and sum of perticuler region r1, c1, r2, c2 given that r1, c1 have to be greter than 0
// time complexity : O(m*n)
// space complexity : O(1)

import java.util.Arrays;
import java.util.Scanner;

// prefixSum method
// time complexity : O(m*n)
// space complexity : O(1)
public class PrefixSum {

  public static void prefixSum(int[][] arr) {
    int m = arr.length;
    int n = arr[0].length;

    // step 1 : row wise prefix sum
    for (int i = 0; i < m; i++) {
      for (int j = 1; j < n; j++) {
        arr[i][j] += arr[i][j - 1];
      }
    }

    // step 2 : column wise prefix sum
    for (int i = 1; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] += arr[i - 1][j];
      }
    }

    // step - extra : printing the prefix sum matrix
    System.out.println("Prefix Sum Array : ---------");
    for (var mat : arr) {
      System.out.println(Arrays.toString(mat));
    }
    System.out.println("----------------------------");
  }

  // sumOfRegion method
  // time complexity : O(1)
  // space complexity : O(1)
  public static int sumOfRegion(int[][] arr, int r1, int r2, int c1, int c2) {
    int sum = 0, up = 0, left = 0, r_region = 0, result = 0;
    sum = arr[r2][c2];
    up = arr[r1 - 1][c2];
    left = arr[r2][c1 - 1];
    r_region = arr[r1 - 1][c1 - 1];

    result = sum - up - left + r_region;

    return result;
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

    // printing the original array
    System.out.println("Original Array : -----------");
    for (var mat : arr) {
      System.out.println(Arrays.toString(mat));
    }
    System.out.println("----------------------------");

    // taking the range input r1, c1, r2, c2  
    //! r1 and c1 have to be greter than 0 given
    System.out.print("r1 : ");
    int r1 = sc.nextInt();
    System.out.print("c1 : ");
    int c1 = sc.nextInt();
    System.out.print("r2 : ");
    int r2 = sc.nextInt();
    System.out.print("c2 : ");
    int c2 = sc.nextInt();

    // calling prefixSum method
    prefixSum(arr);

    // calling sumOfRegion method on prefiexSumed matrix and storing the sum in result
    int result = sumOfRegion(arr, r1, r2, c1, c2);

    // printing the result
    System.out.println("Sum of the region is : " + result);
    sc.close();
  }
}
