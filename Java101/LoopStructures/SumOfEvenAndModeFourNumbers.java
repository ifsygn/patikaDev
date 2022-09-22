/*
Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
 girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

package Java101.LoopStructures;

import java.util.Scanner;

public class SumOfEvenAndModeFourNumbers {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (;;) {
            System.out.print("val: ");
            int val = sc.nextInt();

            if (val % 2 == 1)
                break;

            if (val % 2 == 0) {
                sum += val;
            }
        }

        System.out.printf("Toplam: %d", sum);
    }
}
