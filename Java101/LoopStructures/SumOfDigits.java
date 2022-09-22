/*
Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */

package Java101.LoopStructures;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int val = sc.nextInt();
        int sum = 0;

        for (; val != 0;) {
            sum += val % 10;
            val /= 10;
        }

        System.out.printf("sum: %d", sum);
    }
}
