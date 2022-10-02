package Java102.OOPPrinciples.Inheritance;

public class SecurityGuard extends Officer{
    public SecurityGuard(String fullName, String phoneNumber, String email, String department, String shift) {
        super(fullName, phoneNumber, email, department, shift);
    }

    public SecurityGuard(String fullName, String phoneNumber, String email) {
        super(fullName, phoneNumber, email);
    }
}
