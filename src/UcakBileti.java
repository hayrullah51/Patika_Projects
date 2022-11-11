import java.util.Scanner;

public class UcakBileti {
    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***Welcome DEDELER AIRLINES***");

        //Mesafe Algoritmasi sadece pozitif sayi girilebilir
        int distance = 0;
        boolean trueDistance = false;
        do {
            System.out.println("Please enter distance");

            try {
                distance = scan.nextInt();
            } catch (Exception e) {
                System.err.println("Please enter number!!!");
            }
            if (distance > 0) {
                trueDistance = false;
            } else {
                trueDistance = true;
                System.err.println("Please enter possitive number!!!");
            }

        } while (trueDistance);


        //Gidis Donus Algoritmasi sadece 1 veya 2 girilebilir
        int type = 0;
        boolean entry = false;
        do {
            System.out.println("Press '1' for departure, press '2' for departure and return");

            try {
                type = scan.nextInt();
            } catch (Exception e) {
                System.err.println("Please enter a number!!!");
            }
            if (type == 1 || type == 2) {
                entry = false;
            } else {
                entry = true;
                System.err.println("Please enter 1 or 2");
            }

        } while (entry);

        int age = 0;
        boolean trueAge = false;
        do {
            System.out.println("Please enter your age");

            try {
                age = scan.nextInt();
            } catch (Exception e) {
                System.err.println("Please enter a possitive number!!!");
            }
            if (age > 0 & age < 120) {
                trueAge = false;
            } else {
                trueAge = true;
                System.err.println("Please enter 1 or 2");
            }

        } while (trueAge);

        double totalPrice = (distance * 0.10);

        if(age <12){
            totalPrice *= 0.5;
        } else if (age>=12 & age<65) {
            totalPrice *= 0.1;
        }else {
            totalPrice *= 0.3;
        }

        if (type == 2){
            totalPrice *= 2;
            totalPrice *= 0.2;
        }

        System.out.println("Total Price is : " + totalPrice);


    }
}
