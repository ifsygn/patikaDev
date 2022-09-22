/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
 */

package Java101.LoopStructures;

import java.util.Scanner;

public class InvertedTriangleStar {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
