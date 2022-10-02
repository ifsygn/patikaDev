package Java102.OOPPrinciples.Inheritance;

public class Lecturer extends Academician{
    private String doorNumber;

    Lecturer(String fullName, String phoneNumber, String email, String department, String title, String doorNumber) {
        super(fullName,phoneNumber,email,department,title);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

}
