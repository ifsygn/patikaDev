/*
Java dilinde "Recursive" metot kullanarak,
kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

Senaryo
Sayı Giriniz : 22
22 sayısı ASAL değildir !

Sayı Giriniz : 2
2 sayısı ASALDIR !

Sayı Giriniz : 39
39 sayısı ASAL değildir !

Sayı Giriniz : 17
17 sayısı ASALDIR !
 */
package Java101.Methods;

import java.util.Scanner;

public class RecursivelyPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("Sayı giriniz : ");
            int x = sc.nextInt();
            if (x == 0)
                break;
            if (r(x, 2))
                System.out.printf("%d sayısı ASALDIR!%n", x);
            else
                System.out.printf("%d sayısı ASAL değildir!%n", x);
        }
    }

    public static boolean r(int x, int y) {

        if (x % y == 0) {
            if (y < x)
                return false;
            else
                return true;
        }
        else if (x == 1)
            return false;
        else
            return r(x,y+1);
    }
}

