package Java101.Basics;

import java.util.Scanner;

public class CalculateTaximeter {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        for (;;) {

            System.out.print(" Taksi ile gidilen mesafeyi giriniz: ");
            double distanceKM = Double.parseDouble(kb.nextLine());
            double priceOfKM = 2.20;
            int startPrice = 10;
            double total = startPrice + distanceKM * priceOfKM;
            double finishPrice = (total) > 20 ? total : 20 ;

            if (distanceKM < 0)
                break;

            System.out.printf("ÜCRET: %.2f%n", finishPrice);
        }
    }
}
