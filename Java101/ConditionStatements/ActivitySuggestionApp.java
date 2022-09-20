/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */

package Java101.ConditionStatements;

import java.util.Scanner;

public class ActivitySuggestionApp {
    public static void main(String[] args) {

        int heat;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Hava sıcaklığını giriniz:");
            heat = sc.nextInt();
            if (heat <= 5) System.out.println("Kayak");
            else if (heat <= 15) System.out.println("Sinema");
            else if (heat <= 25) System.out.println("Piknik");
            else System.out.println("Yüzme");
        } while (heat != 0);
    }
}
