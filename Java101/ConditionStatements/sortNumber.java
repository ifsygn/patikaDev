package Java101.ConditionStatements;

import java.util.Scanner;

public class sortNumber {
    public static void main(String []args)
    {
        int a, b, c;
        int max, min;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        a = sc.nextInt();
        System.out.print("İkinci sayı: ");
        b = sc.nextInt();
        System.out.print("Üçüncü sayı: ");
        c = sc.nextInt();

        if (a > b && a > c) {
            if (b > c)
                System.out.print("a > b > c");
            else
                System.out.print("a > c > b");
        }
        else if (b > a && b > c) {
            if (a > c)
                System.out.print("b > a > c");
            else
                System.out.print("b > c > a");
        }
        else if (c > b && c > a)
            if (b > a)
                System.out.print("c > b > a");
            else
                System.out.print("c > a > b");

    }
}
