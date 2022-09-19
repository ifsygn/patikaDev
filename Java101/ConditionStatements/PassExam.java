/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */

package Java101.ConditionStatements;

import javax.swing.text.Style;
import java.util.Objects;
import java.util.Scanner;

public class PassExam {

    public static void main (String[]args) {

        String lessonName = "0";
        int lessonPuan = 0;
        int sum = 0;
        int i = 0;

        Scanner sc = new Scanner(System.in);

        for (;;i++) {

            System.out.print("Dersin ismini giriniz:");
            lessonName = sc.next();

            if (lessonName.equals("elma"))
                break;

            System.out.print("Dersin notunu giriniz:");
            lessonPuan = sc.nextInt();

            sum += lessonPuan;
        }

        int mean = meanPuan(sum,i);
        System.out.printf("Ortalamanız %d:",mean);

        isPassed(mean);

    }

    public static int meanPuan(int sum, int i)
    {
       return sum / i;
    }

    public static void isPassed(int mean)
    {
        if (mean > 50)
            System.out.println("Ders başarılı");
        else
            System.out.println("Ders başarısız");
    }
}
