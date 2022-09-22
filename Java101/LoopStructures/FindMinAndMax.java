/*
Java ile klavyeden girilen N tane sayma sayısından
en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
 */

package Java101.LoopStructures;

import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String []args)
    {
        int max = 0;
        int min = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = sc.nextInt();

        for (int i = 1;i <= n; ++i)
        {
            System.out.printf("%d. Sayıyı giriniz: ", i);
            int x = sc.nextInt();

            if (x > max)
                max = x;
            else if (x < min)
                min = x;
        }
        System.out.printf("max: %d%nmin:%d ", max, min);
    }
}
