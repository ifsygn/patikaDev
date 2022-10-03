package Java102.OOPPrinciples.Interfaces;

import java.util.Scanner;

public class App {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Tutar giriniz: ");
        double price = sc.nextDouble();
        System.out.print("Kart no giriniz: ");
        String cardNumber = sc.next();

        System.out.print("Son Kullanım Tarihi giriniz: ");
        String expirationDate = sc.next();

        System.out.print("Güvenlik Kodunu Giriniz: ");
        String cvc = sc.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.print("Banka Seçiniz: ");
        int selectBank = sc.nextInt();

        switch (selectBank) {
            case 1 :
                BankA aPos = new BankA("A Bankası","1213", "1111");
                aPos.connect();
                aPos.payment(price, cardNumber, expirationDate, cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz!");

        }
    }
}
