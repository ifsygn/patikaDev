package Java101.Classes.BoxGameApp;

public class BoxGameApp {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike Tyson", 40, 120, 100, 50);
        Fighter f2 = new Fighter("Mohammed Ali", 20, 100, 85, 80);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
