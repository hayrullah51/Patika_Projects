import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
        int first = 0, second = 1, total = 0, n;

        System.out.print("Enter number : ");
        n = scan.nextInt();

        System.out.print(first);

        for (int i = 1; i < n; i++) {
            total = first + second;
            System.out.print(" " + total);
            first = second;
            second = total;
        }
    }
}
