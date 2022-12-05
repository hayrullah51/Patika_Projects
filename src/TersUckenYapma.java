import java.util.Scanner;

public class TersUckenYapma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Yuksekligi giriniz : ");

        int yukseklik = scan.nextInt();

        for (int x = 0; x <= yukseklik; x++) {
            for (int c = 0; c < x; c++) {
                System.out.print(" ");
            }

            for (int b = 0; b < (2 * yukseklik) - (2 * x + 1); b++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
