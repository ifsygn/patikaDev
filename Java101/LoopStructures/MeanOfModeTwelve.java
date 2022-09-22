/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

package Java101.LoopStructures;

import java.util.Scanner;

public class MeanOfModeTwelve {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        int limit = sc.nextInt();
        int sum = 0;
        int j = -1;

        for (int i = 0; i < limit; i += 12)
        {
            if (i % 12 == 0) {
                sum += i;
                j++;
            }
        }
        System.out.printf("Ort: %d", sum / j);
    }
}
