/*
Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */
package Java101.LoopStructures;

import java.util.Scanner;

public class FindEBOBandEKOK {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int first = sc.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int second = sc.nextInt();

        int ebob = 1, ekok;

        for (int i = 1; i <= Math.min(first,second); i++) {
            if (first % i == 0 && second % i == 0)
                ebob = i;
        }

        for (int j = Math.max(first,second);;j++) {
            if (j % first == 0 && j % second == 0) {
                ekok = j;
                break;
            }
        }
        System.out.printf("EBOB :%d%nEKOK :%d%n",ebob,ekok);
    }
}
