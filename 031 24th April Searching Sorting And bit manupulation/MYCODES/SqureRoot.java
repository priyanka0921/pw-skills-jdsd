/*
Squre Root of a number
Input-1 : 16
Output : 4
Input-2 : 12
Output : 3
*/
// Time Complexity : O(log n)
// Space Complexity : O(1)

import java.util.Scanner;

public class SqureRoot {

  private static int findSqureRoot(int num) {
    int low = 0;
    int high = num;
    int result = -1;
    //modified binary search
    while (low <= high) {
      int mid = low + (high - low) / 2;
      long val = mid * mid;
      if (val == num) {
        // perfect squre root
        return mid;
      } else if (val < num) {
        // store the flore value, in case the number is not perfect squre
        result = mid;
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();

    // function call
    int result = findSqureRoot(num);
    System.out.println("Squre Root of " + num + " is " + result);

    sc.close();
  }
}
/*
Output 1 : Testcase 1
---------------------
Enter the number : 16
Squre Root of 17 is 4

Output 1 : Testcase 2
---------------------
Enter the number : 12
Squre Root of 16 is 3
*/
