/*
    Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı
    bulan bir program yazıyoruz.

    Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa
     o kelime "Palindromik Kelime'dir".

    Örnek : abba , asa , kavak, kayak
 */
package Java101.OtherTopics;

import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
}
