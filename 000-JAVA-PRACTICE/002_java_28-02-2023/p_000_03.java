import java.util.Scanner;

public class p_000_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Number");
        boolean check = false;
        int n = sc.nextInt();
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                check = true;
                break;
            }
        }

        if (!check) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();

    }
}