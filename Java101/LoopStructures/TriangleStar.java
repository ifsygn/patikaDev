/*
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

package Java101.LoopStructures;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
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
