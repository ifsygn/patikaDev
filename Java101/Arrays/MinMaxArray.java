/*
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
en büyük en yakın sayıyı bulan programı yazınız.

Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
 */

package Java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("val: ");
        int val = sc.nextInt();

        int [] list = {56,34,1,8,101,-2,-33};

        Arrays.sort(list);

        int startData = 0;
        int endData = list.length - 1;

        int min = list[endData];
        int max = list [startData];

        for (int i = 0 ; i < list.length; i++) {
            if(val < min) {
                min = list[endData--];
            }
            if (val > max) {
                max = list[startData++];
            }
        }

        System.out.println("Minimum değer: " + min);
        System.out.println("Maximum değer: " + max);

    }
}
