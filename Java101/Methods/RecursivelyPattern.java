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

public class RecursivelyPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (;;) {
            int start, changer, end;
            int gap;

            System.out.print("Sayıyı giriniz : ");
            start = changer = end = sc.nextInt();
            System.out.print("Farkı giriniz : ");
            gap = sc.nextInt();

            if (start == 0)
                break;
            pattern(start, changer, end, gap);
        }
    }

    public static void pattern(int start, int changer, int end, int gap) {

       if (start > 0) {
           System.out.print(changer + " ");
           start -= gap;
           changer = start;
           pattern(start, changer, end, gap);
       }
       else if (changer <= 0) {
           System.out.print(changer + " ");
           changer += gap;
           pattern(start, changer, end, gap);
       }
       else {
           System.out.print(changer + " ");
           changer += gap;

           if (changer == end)
               System.out.println(changer + " ");

           else
               pattern(start, changer, end, gap);
       }
    }
}
