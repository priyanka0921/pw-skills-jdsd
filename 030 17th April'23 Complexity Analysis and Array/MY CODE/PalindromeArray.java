// palindrome array
// time complexity = O(n)
// space complexity = O(1)

public class PalindromeArray {

  public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 0, 1, 1 };

    int flag = 0;

    for (int i = 0; i <= arr.length / 2; i++) {
      if (arr[i] != arr[arr.length - i - 1]) {
        flag = 1;
        System.out.println("Not a palindromic array.");
        break;
      }
    }

    if (flag == 0) {
      System.out.println("Palindromic array.");
    }
  }
}
