// Linear search 
// Time complexity : O(n)
// Space Complexity : O(1)

/*
 * Advantages :
 * 1. Simple to understand.
 * 2. Usefull in every kind of array sorted or not sorted array.
 * 3. no extra memory space needed.
 * 
 * Disadvantages :
 * 1. if value of n is very big then time required will be very very high.
 */


import java.util.Scanner;

public class LinearSearch {

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

    //linear search
    int idx = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) {
        idx = i;
        break;
      }
    }

    // result
    if (idx == -1) {
      System.out.println("Element not found.");
    } else {
      System.out.println("Element found at " + idx + " index.");
    }

    sc.close();
  }
}
/*
Output :
Enter the number of element : 
5
Enter array elements : 
1 5 4 2 3
Enter target element : 
2
Element found at 3 index.
*/
