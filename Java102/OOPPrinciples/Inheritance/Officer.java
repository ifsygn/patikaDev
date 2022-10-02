package Java102.OOPPrinciples.Inheritance;

public abstract class Officer extends Employee{
    private String department;
    private String shift;

    public Officer(String fullName, String phoneNumber, String email) {
        super(fullName, phoneNumber, email);
    }
    public Officer(String fullName, String phoneNumber, String email, String department, String shift) {
        super(fullName, phoneNumber, email);
        this.department = department;
        this.shift = shift;
    }

    @Override
    public void enterUniversity(String enterTime){
        System.out.println(this.getFullName() + " çalışanı " + enterTime + " saatinde giriş yaptı.");
    }

    public void enterRefectory() {
        System.out.println(this.getFullName() + "çalışanımız yemekhaneye giriş yaptı.");
    }

    public void startWork() {
        System.out.println(this.getFullName() + " çalışmaya başladı.");
    }
}
