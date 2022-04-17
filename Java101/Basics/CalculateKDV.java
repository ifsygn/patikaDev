package Java101.Basics;

import java.util.Scanner;

public class CalculateKDV {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        for (;;) {

            System.out.print(" price? ");
            double price = Double.parseDouble(kb.nextLine());

            if (price == -1)
                break;

            System.out.printf("GPA: %.2f%n", price);

            double totalPrice = (price < 1000 && price > 0) ? price * 1.18 : price * 1.08;
            double kdv = totalPrice - price;

            System.out.printf("KDV: %f", kdv);
        }
    }
}
