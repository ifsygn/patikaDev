package Java102.OOPPrinciples.Inheritance;

public abstract class Academician extends Employee{
    private String department;
    private String title;

    Academician(String fullName, String phoneNumber, String email) {
        super(fullName, phoneNumber, email);

    }

    Academician(String fullName, String phoneNumber, String email, String department, String title) {
        super(fullName, phoneNumber, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void enterLesson() {
        System.out.println(this.getFullName() + " derse giriş yaptı.");
    }

    public void enterRefectory() {
        System.out.println(this.getFullName() + "hocamız yemekhaneye giriş yaptı.");
    }

    @Override
    public void enterUniversity(String enterTime) {
        System.out.println(this.getFullName() + " Hocamız " + enterTime + " saatinde giriş yaptı.");
    }
}
