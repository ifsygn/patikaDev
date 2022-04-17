package Java101.Basics;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        for (;;) {

            System.out.print(" Lütfen boyunuzu (metre cinsinde) giriniz: ");
            double height = Double.parseDouble(kb.nextLine());

            System.out.print(" Kilonuzu giriniz: ");
            double weight = Double.parseDouble(kb.nextLine());

            if (height < 0 || weight < 0)
                break;

            double index = weight / (height * height);
            System.out.printf(" Vücut Kitle İndeksiniz: %.2f%n ", index);
        }
    }
}
