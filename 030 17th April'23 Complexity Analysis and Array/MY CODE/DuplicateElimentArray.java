// to find the duplicate elements in an array
// Time complexity : O(n^2)
// Space complexity : O(1)

public class DuplicateElimentArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 3, 3, 6 };
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          System.out.println("Duplicate Element : " + arr[j]);
          break;
        }
      }
    }
  }
}
