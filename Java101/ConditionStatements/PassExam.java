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

        JOIN_LOOP:
        for (;;i++) {

            System.out.print("Dersin ismini giriniz:");
            lessonName = sc.next();

            if (lessonName.equals("elma"))
                break;

            System.out.print("Dersin notunu giriniz:");
            lessonPuan = sc.nextInt();

            if (lessonPuan < 0 || lessonPuan > 100)
                break;

            sum += lessonPuan;
        }
        if (i == 0)
            System.exit(0);

        isPassed(meanPuan(sum,i));
    }

    public static int meanPuan(int sum, int i)
    {
        int mean = sum / i;
        System.out.printf("Ortalamanız %d:",mean);
       return mean;
    }

    public static void isPassed(int mean)
    {
        if (mean > 50)
            System.out.println("Ders başarılı");
        else
            System.out.println("Ders başarısız");
    }
}
