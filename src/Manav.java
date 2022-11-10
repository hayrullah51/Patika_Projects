import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double pearPrice, applePrice, tomatoesPrice, bananaPrice , strawberryPrice;
        double pearKilo, appleKilo, tomatoesKilo, bananaKilo , strawberryKilo;
        pearPrice = 2.14;
        applePrice = 3.67;
        tomatoesPrice = 1.11;
        bananaPrice = 0.95;
        strawberryPrice = 5.0;

        Scanner scan = new Scanner(System.in);
        System.out.println("You are Welcome");

        System.out.println("How many kilos of apples do you want?");
        appleKilo = scan.nextDouble();

        System.out.println("How many kilos of pears do you want?");
        pearKilo = scan.nextDouble();

        System.out.println("How many kilos of tomatoes do you want?");
        tomatoesKilo = scan.nextDouble();

        System.out.println("How many kilos of bananas do you want?");
        bananaKilo = scan.nextDouble();

        System.out.println("How many kilos of strawberrys do you want?");
        strawberryKilo = scan.nextDouble();

  double totalPrice = applePrice*appleKilo + pearPrice*pearKilo + tomatoesPrice*tomatoesKilo + bananaPrice*bananaKilo +strawberryPrice*strawberryKilo;

        System.out.println("Thanks, Total Price is : " + totalPrice + "$" + "\nSee you later");


    }
}
