// Binary Search
// Time Complexity : O(log n)
// Space Complexity : O(1)

/*
 * Advantages:
 * 1. lower complexity than linerar search
 *
 * Disadvantages:
 * 1. Works on sorted array only.
 */

import java.util.Scanner;

public class BinarySearch {

  // binary search
  public static int binarySearch(int[] arr, int target) {
    int low = 0, high = (arr.length - 1);

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    // taking array element
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element : ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter array elements : ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // target elemnt
    System.out.println("Enter target element : ");
    int x = sc.nextInt();

    // function calling of binary search
    int result = binarySearch(arr, x);

    // result
    if (result == -1) {
      System.out.println("Element not found.");
    } else {
      System.out.println("Element found at " + result + " index.");
    }

    sc.close();
  }
}
/*
Output :
Enter the number of element : 
5
Enter array elements : 
1 2 3 4 5
Enter target element : 
4
Element found at 3 index.
*/
