/*
Ödev
Java döngüler ile girilen sayıya kadar olan
4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */

package Java101.LoopStructures;

import java.util.Scanner;

public class FindPowerOfFourAndFive {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("val: ");
        int val = sc.nextInt();

        for (int i = 1; i < val; i *= 4) {
            System.out.printf("4'ün kuvvetleri: %d%n", i);
        }

        System.out.println("--------------------------------");

        for (int i = 1; i < val; i *= 5) {
            System.out.printf("5'in kuvvetleri: %d%n", i);
        }
    }
}

