import java.util.Scanner;

public class UstHesabi {
    static int result = 1;

    static int exponent(int x, int y) {
        if (x == 0) {
            return 1;
        }
        result *= y;
        exponent(x - 1, y);
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.println("Enter number : ");
        y = input.nextInt();
        System.out.println("Enter upper number: ");
        x = input.nextInt();

        System.out.println(exponent(x, y));
    }


}
