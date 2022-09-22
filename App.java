/*
    ATM Projesi
 */

import java.util.*;

public class App {
        static String savedUsername = "patika";
        static String savedPassword = "dev123";
        static Scanner sc = new Scanner(System.in);
        static int tryJoin = 3;
        static int select;
        static int price;
        static int balance;

    public static void main(String[] args) {

        KULLANICI_GIRISI:
        for(;;) {
        System.out.println("Patika Bankasına Hoş Geldiniz.\nGiriş yapmak için 'Evet'e Basınız ");
        String join = sc.nextLine();
            if (!join.equals("Evet")) break;

            while (tryJoin > 0) {
                System.out.print("Kullanıcı Adınız:");
                String name = sc.nextLine();
                System.out.print("Şifreniz:");
                String password = sc.nextLine();
                if (name.equals(savedUsername) && password.equals(savedPassword)) {
                    System.out.println("Giriş Başarılı.");
                    break;
                } else {
                    System.out.println("Tekrar girmeyi deneyiniz.");
                    tryJoin--;
                    System.out.printf("%d hakkınız kaldı!%n", tryJoin);
                }
            }

            if (tryJoin == 0) {
                System.out.println("3 Kez Yanlış Giriş Yaptınız. Hesabınız bloke olmuştur." +
                        "\nLütfen banka ile iletişime geçin!");
                break;
            }
            BANKA_ISLEMLERI:
            for (;;) {
                //Banka işlemleri
                System.out.println(
                        "1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                select = sc.nextInt();

                switch (select) {
                    case 1:
                        System.out.printf("Mevcut bakiyeniz: %d%n", balance);
                        System.out.print("Yatırmak istediğiniz para miktarını giriniz: ");
                        price = sc.nextInt();
                        balance += price;
                        System.out.printf("Mevcut bakiyeniz: %d%n", balance);
                        break;

                    case 2:
                        System.out.printf("Mevcut bakiyeniz: %d%n", balance);
                        System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
                        int price = sc.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                            System.out.printf("Hesabınızda kalan bakiye: %d%n", balance);
                        }
                        break;
                    case 3:
                        System.out.printf("Mevcut bakiyeniz: %d%n", balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break BANKA_ISLEMLERI;
                }
            }
        }
    }//end of main
}//end of class

