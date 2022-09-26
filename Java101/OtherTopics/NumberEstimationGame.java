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
        int[] wrong = new int[chance];
        int count = 0;

        while (true) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = sc.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı: " + number);
                break;
            } else {
                System.out.println("Tahmininiz  yanlış !");
                if (selected > number)
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                else
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");

                if (--chance > 0) {
                    wrong[count++] = selected;
                    System.out.println("Kalan hakkı : " + chance);
                    System.out.println("----------------------------------------");
                } else {
                    wrong[count++] = selected;
                    System.out.println("Hakkınız kalmadı\n" +
                            "Tahmin edilmeye çalışılan sayı: " + number);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(wrong));
    }
}