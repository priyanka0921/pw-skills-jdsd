// missing number in an array
// time complexity = o(n)
// space complexity = o(1)

public class missingNumberArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 5, 6, 7};
    int n = arr.length;
    int sumArray = 0;
    int sumNaturalNumber = (n+1)*((n+1)+1)/2;

    for (int i = 0; i < n; i++) {
      sumArray += arr[i];
    }

    System.out.println("Missing number is : "+ (sumNaturalNumber-sumArray));
  }
}
