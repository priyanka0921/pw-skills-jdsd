// Missing number of an array
// time complexity : O(n)
// Space Complexity : O(1)

public class missingNumberArray_2 {

  static int missingNumber(int a[], int n) {
    int total = 1;
    for (int i = 2; i <= (n + 1); i++) {
      total += i;
      total -= a[i - 2];
    }
    return total;
  }

  // Driver Code
  public static void main(String[] args) {
    int[] arr = { 2, 1, 5, 4 };
    int n = arr.length;

    // Function call
    System.out.println("The missing number is " + missingNumber(arr, n));
  }
}
