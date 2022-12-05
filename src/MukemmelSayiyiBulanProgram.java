import java.util.Scanner;

public class MukemmelSayiyiBulanProgram {
    public static void main(String[] args) {
        /*
        Matematikte bazı pozitif tam sayıların pozitif bölenleri toplamı,
        sayının kendisinin iki katına eşittir.
        Bu tür sayılara “mükemmel sayı” denir.
         */

        Scanner scan = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.print("Please Enter Number : ");

        number = scan.nextInt();

        for (int i = number - 1; i >= 1; i--) {

            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {

            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not perfect number");

        }


    }
}
