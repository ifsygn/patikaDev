package Java102.OOPPrinciples.Inheritance;

public abstract class Employee {
    private String fullName;
    private String phoneNumber;
    private String email;

    /*
        private Employee() {

    }
     */

    Employee(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public abstract void enterRefectory();

    public void enterUniversity() {
        System.out.println(this.getFullName() + "  Üniversiteye giriş yaptı.");
    }

    public void enterUniversity(String enterTime) {
        System.out.println(this.getFullName() + " " + enterTime + " saatinde Üniversiteye giriş yaptı.");
    }

    public void exitUniversity(String exitTime) {
        System.out.println(this.getFullName() + " " + exitTime + " saatinde Üniversiteden çıkış yaptı.");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printFullName() {
        System.out.println(this.getFullName());
    }

    public static void enteredEmployees(Employee [] loginUsers) {
        for(Employee e : loginUsers) {
            e.enterUniversity();
        }
    }
}
