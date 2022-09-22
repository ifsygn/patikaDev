/*
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */
package Java101.LoopStructures;

import java.util.Scanner;

public class CombinationCalculatorApp {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("C(n,r) kombinasyonu için değerleri giriniz.");
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("r: ");
        int r = sc.nextInt();

        System.out.print(combination(n,r));
    }

    public static int factorial(int n)
    {
        int nFactorial = 1;

        for (int i = n; i > 0; i--) {
            nFactorial *= i;
        }
        return nFactorial;
    }

    public static int combination(int n, int r)
    {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
