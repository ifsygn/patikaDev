/*
Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */

package Java101.Methods;
import java.util.Scanner;

public class Palidrome {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Limit değeri giriniz: ");
        int limit = sc.nextInt();

        for (int i = 1; i < limit; i++) {
            if (isPalindrome(i)){
                System.out.printf("%d is Palindrome%n",i);
            }
        }
    }
    public static boolean isPalindrome(int val) {

        int temp = val;
        int oppositeVal = 0;

        while (temp > 0) {
            oppositeVal *= 10;
            oppositeVal += val % 10;
            temp /= 10;
        }
        return val == oppositeVal;
    }
}
