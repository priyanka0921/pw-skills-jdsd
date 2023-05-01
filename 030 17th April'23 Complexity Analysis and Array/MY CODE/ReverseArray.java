// reverse an array 
// time complexity O(n)
// space complexity O(1)

import java.util.Arrays;

public class ReverseArray {

    // swap array element 
    public static void swapArrayElement(int[] arr, int a, int b){
        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b];
    }

    public static void main(String[] args) {
        int arr[] = {14 , 12 , 10, 8, 4, 2};
        System.out.println("Original Array : "+ Arrays.toString(arr));

        for(int i = 0;i<arr.length/2;i++){
            swapArrayElement(arr, i, (arr.length-i-1));
        }

        System.out.println("Reversed Array : "+ Arrays.toString(arr));

    }
}
