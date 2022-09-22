/*
Ödev
Java ile kullanıcının girdiği değerler ile
üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */

package Java101.LoopStructures;

import java.util.Scanner;

public class ExponentCalculatorApp {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("x^n için değerleri giriniz.");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("n: ");
        int n = sc.nextInt();

        System.out.print(pow(x,n));
    }
    public static int pow(int x, int n)
    {
        int result = 1;

        for (int i = 0; i < n; i++)
        {
            result *= x;
        }

        return result;
    }
}
