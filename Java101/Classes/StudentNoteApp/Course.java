package Java101.Classes.StudentNoteApp;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int verbalNote;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int examNote = 0;
        int verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacherInfo();
        } else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
        }

    }



    void printTeacherInfo () {
        this.teacher.print();
    }
}