import java.util.Scanner;

public class BodyMassIndexCalculatorProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Weight(as inche)...");
        double weight = scan.nextDouble();

        System.out.println("Please Enter Your Height(as meter)...");
        double height = scan.nextDouble();

        double result = weight/(height * height);

        System.out.println("Your Body Mass Index : " + result);


    }
}
