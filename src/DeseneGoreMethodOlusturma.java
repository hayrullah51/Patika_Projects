import java.util.Scanner;

public class DeseneGoreMethodOlusturma {
    static int negative(int x) {
        if (x <= 0){
            return x;
        }
        else {
            System.out.print(x + " ");
            return negative(x-5);
        }
    }
    static int positive(int x,int y) {
        if(x > y){
            return x;
        }
        else {
            System.out.print(x + " ");
            return positive(x+5,y);
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter number : ");
            int number = scan.nextInt();

            positive(negative(number),number);

            if (number == 0){
                break;
            }

            System.out.println("\nPress 0 to exit.");
        }
    }
}
