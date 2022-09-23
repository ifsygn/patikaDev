package Java101.Classes.StudentNoteApp;

class App {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell","FZK","0000");
        Teacher t3 = new Teacher("Külyutmaz","BIO","111");

        System.out.println("==========================================");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        System.out.println("==========================================");

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,200,50);
        s1.printNote();

        System.out.println("==========================================");

        Student s2 = new Student("İsmail Furkan Saygın","001","mezun",tarih,fizik,biyo);
        s2.addClassNote(fizik,50,100);

        s2.calcAvarage(fizik);
    }
}




