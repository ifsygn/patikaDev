/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.

- Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
- Mesafe başına ücret 0,10 TL / km olarak alın.
- İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

- Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
- Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
- Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL

Senaryolar

Senaryo 1
Mesafeyi km türünden giriniz : 1500
Yaşınızı giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
Toplam Tutar = 216 TL

Senaryo 2
Mesafeyi km türünden giriniz : -500
Yaşınızı giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77
Hatalı Veri Girdiniz !

Senaryo 3
Mesafeyi km türünden giriniz : 200
Yaşınızı giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1
Toplam Tutar = 20.0 TL

 */

package Java101.ConditionStatements;

import java.util.Scanner;

public class CalcFlightPriceTicket {
    public static void main(String[] args)
    {
        int distanceKM, passengerAge, flightType;
        double flightPrice;

        Scanner sc = new Scanner(System.in);

        System.out.print("Gidilen yerin uzaklığını giriniz(km): ");
        distanceKM = sc.nextInt();
        flightPrice = distanceKM / 10;

        System.out.print("Yolculuk tipini giriniz: ");
        flightType = sc.nextInt();

        System.out.print("Yolcunun yaşını giriniz: ");
        passengerAge = sc.nextInt();


        if (passengerAge >= 0 && passengerAge <= 12)
            flightPrice = (1 - 0.5) * flightPrice;
        else if (passengerAge >= 13 && passengerAge <= 24)
            flightPrice = (1 - 0.1) * flightPrice;
        else if (passengerAge >= 65)
            flightPrice = (1 - 0.3) * flightPrice;

        if (flightType == 2)
            flightPrice = (1 - 0.2) * flightPrice;

        System.out.printf("Toplam Tutar:%.02f TL ", flightPrice);
    }
}

