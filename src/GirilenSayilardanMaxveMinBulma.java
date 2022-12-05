import java.util.Scanner;

public class GirilenSayilardanMaxveMinBulma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers will you enter : ");

        int count = scan.nextInt();
        int max = 0, min = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + "Enter number :");

            int number = scan.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            }
            if (min > number)
                min = number;
            else if (max < number)
                max = number;
        }
        System.out.println("Max number : " + max);
        System.out.print("Min number : " + min);

    }
}
