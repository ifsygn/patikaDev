package Java102.OOPPrinciples.Interfaces;

public class BankA {
    private String bankName;
    private String terminalID;
    private String password;

    BankA(String bankName, String terminalID, String password) {
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    public void connect() {
        System.out.println(this.bankName + " Bağlanıldı !");
    }


    public void payment(double price, String cardNumber, String expiryDate, String CVC) {
        //Banka Ödeme İşlemleri:
        System.out.println("Bankadan cevap bekleniyor...");
        System.out.println("İşlem başarılı oldu.");
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
