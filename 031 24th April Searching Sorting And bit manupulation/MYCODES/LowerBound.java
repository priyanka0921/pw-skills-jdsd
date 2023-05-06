// Lower Bound, First Occurance of an element in an sorted array
// Time Complexity : O(log n)
// Space Complexity : O(1)

import java.util.Scanner;

public class LowerBound {

  // Lower Bound
  public static int lowerBound(int[] arr, int target) {
    int low = 0, high = (arr.length - 1), result = -1;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        result = mid;
        high = mid -1;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else if (arr[mid] > target) {
        high = mid - 1;
      }
    }

    return result;
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

    // function calling of Lower Bound
    int result = lowerBound(arr, x);

    // result
    if (result == -1) {
      System.out.println("Element not found.");
    } else {
      System.out.println("Lower bund of  " + x + " is " + result);
    }

    sc.close();
  }
}

/*
Output :
Enter the number of element : 
5
Enter array elements : 
1 1 2 4 4 
Enter target element : 
4
Lower bund of  4 is 3
*/
