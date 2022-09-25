/*
Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı
kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
 */
package Java101.OtherTopics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberEstimationGame {
    public static void main(String[]args) {

        Random rand = new Random();
        int number = rand.nextInt(100);
        //System.out.println(number);
        // int number = (int)(Math.random() * 100);

        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç kez denemek istiyorsunuz: ");
        int chance = sc.nextInt();
        int selected = 0;

        while (chance > 0) {
            System.out.println("Lütfen tahmininizi giriniz: ");
            selected = sc.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı: " + number);
                break;
            } else {
                System.out.println("Tahmininiz  yanlış !");
                System.out.println("----------------------------------------");
                if (selected > number)
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                else
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                if (chance != 0) {
                    System.out.println("Kalan hakkı : " + (--chance));
                } else {
                    System.out.println("Hakkınız kalmadı");
                    break;
                }
            }
        }
        System.out.println(number);
    }
}
