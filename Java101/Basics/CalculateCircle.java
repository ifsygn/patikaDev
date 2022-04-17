package Java101.Basics;

import java.util.Scanner;

public class CalculateCircle {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        for (;;) {

            System.out.print(" Dairenin Çapını giriniz: ");
            double r = Double.parseDouble(kb.nextLine());

            if (r < 0)
                break;

            CalculateCircle.area(r);
            CalculateCircle.perimeter(r);
        }
    }

    public static void area(double r)
    {
        double area = Math.PI * r * r;
        System.out.printf(" Dairenin Alanı:%f%n", area);

    }

    public static void perimeter(double r)
    {
        double perimeter = 2 * Math.PI * r;
        System.out.printf(" Dairenin Alanı:%f%n", perimeter);
    }
}


