/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.

Harmonik Seri Formülü :
1/1 + 1/(1+1) + 1/(2+1) +... ∑ n = 0 -> n = ∞(1/n)

 */

package Java101.LoopStructures;

import java.util.Scanner;

public class FindHarmonicNumbers {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        double n = sc.nextDouble();
        double result = 0;

        for (double i = 1; i <= n; i++) {
            result += 1/i;
        }
         System.out.print(result);
    }

}
