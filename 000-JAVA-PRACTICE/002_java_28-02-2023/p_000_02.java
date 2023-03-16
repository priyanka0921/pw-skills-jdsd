import java.util.Scanner;

public class p_000_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input array row : ");
            // creating the array 
            int n = sc.nextInt();
            int arr[][] = new int[n][];
            for (int i = 0; i < n; i++) {
                System.out.print("Input number of elemrnt in "+ (i+1) +" row : ");
                arr[i] = new int[sc.nextInt()];
            }
            // counting array elemnts 
            int count = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    count++;
                }
            }
            // input array elements  
            System.out.println("Input "+ count +" array Elemets : ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // array output 
            System.out.println("Your jaged array is : ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
