/*
Ödev
Aynı projeye mod almak ve
dikdörtgen alan çevre hesabını yapan metotları yazıp menüde işlevsel hale getiriniz.
 */

package Java101.Methods;

import java.util.Scanner;

public class CalculatorApp {
    static Scanner sc = new Scanner(System.in);
    static int select;
    static String menu = "1- Toplama İşlemi\n"
            + "2- Çıkarma İşlemi\n"
            + "3- Çarpma İşlemi\n"
            + "4- Bölme işlemi\n"
            + "5- Üslü Sayı Hesaplama\n"
            + "6- Faktoriyel Hesaplama\n"
            + "7- Mod Alma\n"
            + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
            + "0- Çıkış Yap";

    public static void main(String[] args) {

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangular();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
    static void plus() {
        int number, result = 0, i = 1;
        while (true) {
            System.out.printf("%d. sayı :", i++);
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = sc.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = sc.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        int number, result = 1, i = 1;

        do {
            System.out.print(i++ + ". sayı :");
            number = sc.nextInt();
            result *= number;

        } while (number != 1 && number != 0);

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = sc.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = sc.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        System.out.print("Taban değeri giriniz :");
        int x = sc.nextInt();
        System.out.print("Üs değeri giriniz :");
        int n = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        System.out.print("Sayı giriniz :");
        int n = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mode() {
        System.out.print("Sayı:");
        int x = sc.nextInt();
        System.out.print("mode: ");
        int n = sc.nextInt();
        System.out.println(x % n);
        }

    static void rectangular() {
        System.out.print("1. Kenar :");
        int x = sc.nextInt();
        System.out.print("2. Kenar :");
        int y = sc.nextInt();

        System.out.println("Alanı : " + x * y + " Çevresi : " + 2 * (x + y));
    }
}

