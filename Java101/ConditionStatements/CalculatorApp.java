package Java101.ConditionStatements;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        for (;;) {

            System.out.print("ilk sayıyı giriniz: ");
            int x = Integer.parseInt(kb.nextLine());

            System.out.print("ikinci sayıyı giriniz: ");
            int y = Integer.parseInt(kb.nextLine());

            if (x < 0 || y < 0)
                break;

            System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
            System.out.print("Seçiminiz: ");
            int select = Integer.parseInt(kb.nextLine());
            int result = 0;

            switch (select) {
                case 1:
                    result = x + y;
                    break;
                case 2:
                    result = x - y;
                    break;
                case 3:
                    result = x * y;
                    break;
                case 4:
                    if (y == 0) {
                        System.out.print("Bir sayı sıfıra bölünemez!");
                        return;
                    }
                    result = x / y;
                    break;
            }

            System.out.printf("Sonuç: %d%n",result);
        }
    }
}
