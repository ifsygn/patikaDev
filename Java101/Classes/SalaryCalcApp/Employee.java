/*
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile
çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız.

Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları

Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.

tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.

bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise
fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.

raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.
Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.

toString() : Çalışana ait bilgileri ekrana bastıracaktır.

ÖRNEK
Adı : kemal
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2300.0
 */
package Java101.Classes.SalaryCalcApp;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        }
        else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        else return 0;
    }

    double raiseSalary() {
        if (this.hireYear < 10)
            return salary * 0.05;
        else if (this.hireYear < 20)
            return salary * 0.10;
        else
            return salary * 0.15;
    }

    double totalSalary() {
        return salary + raiseSalary() + bonus() - tax();
     }


    public String toString() {
        System.out.println("Çalışan adı : " + this.name);
        System.out.println("Maaş : " + this.salary + " TL");
        System.out.println("Çalışma Süresi : " + this.workHours + " saat");
        System.out.println("İşe Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax() + " TL");
        System.out.println("Bonus : " + this.bonus() + " TL");
        System.out.println("Maaş Artışı : " + this.raiseSalary() + " TL");
        System.out.println("Toplam Maaş : " + this.totalSalary() + " TL");
        return null;
    }
}
