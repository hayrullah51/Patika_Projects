import java.util.Scanner;

public class CinZodya {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Kullanicidan dogum yili alinir
        System.out.println("Please enter your bird of year");
        int year = scan.nextInt();

        //Dogum yilinin 12 ile bolumu bulunur
        int result = year%12;

        //Zodyak yili enizi ekrana yazdirir
        switch (result){

            case 0 :
                System.out.println("Cin Zodyagın : Maymun");
                break;
            case 1 :
                System.out.println("Cin Zodyagın : Horoz");
                break;
            case 2 :
                System.out.println("Cin Zodyagın : Kopek");
                break;
            case 3 :
                System.out.println("Cin Zodyagın : Domuz");
                break;
            case 4 :
                System.out.println("Cin Zodyagın : Fare");
                break;
            case 5 :
                System.out.println("Cin Zodyagın : Okuz");
                break;
            case 6 :
                System.out.println("Cin Zodyagın : Kaplan");
                break;
            case 7 :
                System.out.println("Cin Zodyagın : Tavsan");
                break;
            case 8 :
                System.out.println("Cin Zodyagın : Ejderha");
                break;
            case 9 :
                System.out.println("Cin Zodyagın : Yılan");
                break;
            case 10 :
                System.out.println("Cin Zodyagın : At");
                break;
            case 11 :
                System.out.println("Cin Zodyagın : Koyun");
                break;
        }




    }
}
