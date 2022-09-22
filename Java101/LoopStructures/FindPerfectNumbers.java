/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır

 */

package Java101.LoopStructures;

import java.util.Scanner;

public class FindPerfectNumbers {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("Bir sayı giriniz: ");
            int n = sc.nextInt();
            int i = 1;
            int sum = 0;
            do {
                if (n % i == 0)
                    sum += i;
                ++i;
            } while (i <= n / 2);

            if (n == 0)
                break;
            else if (sum != n || n == 1)
                System.out.printf("%d Mükemmel sayı değildir.%n", n);
            else
                System.out.printf("%d Mükemmel sayıdır.%n", n);
        }
    }
}
