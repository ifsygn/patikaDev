/*
Ödev
Course sınıfına derse ait sözlü notu kısmını girin
ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
Sözlü notlarınıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */

package Java101.Classes.StudentNoteApp;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.examNote = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.examNote = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.examNote = note3;
        }
    }

    void addClassNote(Course course, int verbalNote, int examNote) {
        if (verbalNote >= 0 && verbalNote <= 100) {
            course.verbalNote = verbalNote;
        }
        if(examNote >= 0 && examNote <= 100){
            course.examNote = examNote;
        }
    }

    void isPass() {
        this.average = (this.c1.examNote + this.c2.examNote + this.c3.examNote) / 3.0;
        if (this.average > 55) {
            System.out.println("Hababam sınıfı uyanıyor ! ");
            this.isPass = true;
        } else {
            System.out.println("Hababam sınıfı, sınıfta kaldı ! ");
            this.isPass = false;
        }
    }

    void calcAvarageCourse(Course course) {
        double courseAverage = 0.20 * course.verbalNote + 0.80 * course.examNote;

        System.out.println(course.name + " dersinin ortalaması: " + courseAverage);
    }

    void printNote() {
        System.out.println(this.c1.name + "Notu:" + this.c1.examNote);
        System.out.println(this.c2.name + "Notu:" + this.c2.examNote);
        System.out.println(this.c3.name + "Notu:" + this.c3.examNote);
        System.out.println("Ortalamanız: " + this.average);
    }
}