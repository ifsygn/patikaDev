package Java101.Basics;

import java.util.Scanner;

public class CalculateHipotenus {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        for (; ; ) {

            System.out.print(" 1. Kenarı Giriniz? ");
            int a = Integer.parseInt(kb.nextLine());

            System.out.print(" 2. Kenarı Giriniz? ");
            int b = Integer.parseInt(kb.nextLine());

            if ((a | b) == -1)
                break;

            double c = Math.sqrt(a * a + b * b);

            System.out.printf("Hipotenus: %.2f%n", c);
        }
    }
}