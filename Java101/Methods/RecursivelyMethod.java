/*
Java dilinde kullanıcıdan alınan n değerine göre
aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural :
1. Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
2. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
3. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
4. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16


N Sayısı : 10
Çıktısı : 10 5 0 5 10


N Sayısı : 25
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25


N Sayısı : 5
Çıktısı : 5 0 5
 */
package Java101.Methods;

import java.util.Scanner;

public class RecursivelyMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("Sayı giriniz : ");
            int x = sc.nextInt();
            if (x == 0)
                break;
            r(x, 5);
        }
    }

    public static void r(int x, int y) {

        System.out.println(x);
        if (x <= 0)
            r(x + y, y);
        else if (x > 0)
            r(x - y, y);
    }
}
