package Java101.Basics;

import java.util.Scanner;

public class GroceryStore {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        for (;;) {

            double armutPrice = 2.14, elmaPrice = 3.67, domatesPrice = 1.11 , muzPrice = 0.95, patlicanPrice = 5.0;

            System.out.print(" Armut Kaç Kilo ? ");
            double armut = Double.parseDouble(kb.nextLine());

            System.out.print(" Elma Kaç Kilo ? ");
            double elma = Double.parseDouble(kb.nextLine());

            System.out.print(" Domates Kaç Kilo ? ");
            double domates = Double.parseDouble(kb.nextLine());

            System.out.print(" muz Kaç Kilo ? ");
            double muz = Double.parseDouble(kb.nextLine());

            System.out.print(" Patlıcan Kaç Kilo ? ");
            double patlican = Double.parseDouble(kb.nextLine());

            double total = armut*armutPrice + elma*elmaPrice + domates*domatesPrice +
                    muz*muzPrice + patlican*patlicanPrice;
            System.out.printf(" Toplam: %.2f TL %n ", total);
        }
    }
}
