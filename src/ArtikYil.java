import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();
        boolean artikMi = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    artikMi = true;
                else
                    artikMi = false;
            }
            else
                artikMi = true;
        }
        else
            artikMi = false;

        if(artikMi)
            System.out.println(year + " yili artik yildir.");
        else
            System.out.println(year + " yili artik yıl değildir.");
    }
}
