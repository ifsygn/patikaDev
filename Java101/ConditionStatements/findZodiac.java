/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.
 */

package Java101.ConditionStatements;

import java.util.Scanner;

public class findZodiac {
    public static void main(String[] args)
    {
        int day, month;

        Scanner sc = new Scanner(System.in);

        System.out.print("Doğduğun Gün: ");
        day = sc.nextInt();

        System.out.print("Doğduğun Ay: ");
        month = sc.nextInt();

        if (month == 1) {
            if (day >= 1 && day < 21) {
                System.out.println("Oğlak Burcu");
            }
            else if (day > 21 && day < 31) {
                    System.out.println("Kova Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 2) {
            if (day >= 1 && day < 20) {
                System.out.println("Kova Burcu");
            }
            else if (day > 19 && day <= 29) {
                System.out.println("Balık Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 3) {
            if (day >= 1 && day < 21) {
                System.out.println("Balık Burcu");
            }
            else if (day > 20 && day <= 31) {
                System.out.println("Koç Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 4) {
            if (day >= 1 && day < 21) {
                System.out.println("Balık Burcu");
            }
            else if (day > 20 && day <= 30) {
                System.out.println("Boğa Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 5) {
            if (day >= 1 && day < 22) {
                System.out.println("Boğa Burcu");
            }
            else if (day > 21 && day <= 31) {
                System.out.println("İkizler Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 6) {
            if (day >= 1 && day < 23) {
                System.out.println("İkizler Burcu");
            }
            else if (day > 22 && day <= 30) {
                System.out.println("Yengeç Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 7) {
            if (day >= 1 && day < 23) {
                System.out.println("Yengeç Burcu");
            }
            else if (day > 22 && day <= 31) {
                System.out.println("Aslan Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 8) {
            if (day >= 1 && day < 23) {
                System.out.println("Aslan Burcu");
            }
            else if (day > 22 && day <= 31) {
                System.out.println("Başak Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 9) {
            if (day >= 1 && day < 23) {
                System.out.println("Başak Burcu");
            }
            else if (day > 22 && day <= 30) {
                System.out.println("Terazi Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 10) {
            if (day >= 1 && day < 23) {
                System.out.println("Terazi Burcu");
            }
            else if (day > 22 && day <= 31) {
                System.out.println("Akrep Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 11) {
            if (day >= 1 && day < 22) {
                System.out.println("Akrep Burcu");
            }
            else if (day > 21 && day <= 30) {
                System.out.println("Yay Burcu");
            }
            else System.out.println("Geçersiz");
        }
        if (month == 12) {
            if (day >= 1 && day < 22) {
                System.out.println("Yay Burcu");
            }
            else if (day > 21 && day <= 31) {
                System.out.println("Oğlak Burcu");
            }
            else System.out.println("Geçersiz");
        }
    }
}
