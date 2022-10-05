package Java102.patikaAdventureGame;

import java.awt.*;
import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz! ");
        System.out.println("Lütfen bi isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz.");
        System.out.println("Burada yaşananların hepsi gerçek !!");

    }
}
