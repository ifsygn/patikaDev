/*
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot
kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1

Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8

Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
 */
package Java101.Methods;

import java.util.Scanner;

public class RecursivelyExponential {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        int x = sc.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int n = sc.nextInt();

        System.out.print(r(x,n));

    }
    public static int r(int x, int n) {
        int result = 1;
        if (n == 0)
            return result;
        result = x * r(x,n - 1);
            return result;
    }
}