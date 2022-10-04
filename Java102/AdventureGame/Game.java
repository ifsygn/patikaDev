package Java102.AdventureGame;

import Java102.AdventureGame.Location.*;
import Java102.AdventureGame.Player.*;


import java.util.Scanner;

public class Game {
    public static Player player;
    public static Location location;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Karakter seç.
        System.out.print("1- Samurai\n" +
                "2- Archer\n" +
                "3- Knight\n" +
                "Seçmek istediğiniz karakteri belirleyiniz...");

        int characterNo = sc.nextInt();

        if (characterNo == 1)
            player = new Samurai();
        else if (characterNo == 2)
            player = new Archer();
        else
            player = new Knight();

        start();
    }

    public static void start() {

        ToolStore toolStore = new ToolStore(player);
        SafeHouse safeHouse = new SafeHouse(player);
        Forest forest = new Forest(player);
        Cave cave = new Cave(player);
        River river = new River(player);

        int select;

        for (;;) {

            LOCATION_LOOP:
            for (;;){

                System.out.print("------------------------------\n" +
                        "Nereye gitmek istersiniz? \n" +
                        "1. ToolStore\n" +
                        "2. SafeHouse\n" +
                        "3. Forest\n" +
                        "4. Cave\n" +
                        "5. River\n" +
                        "?:");

                select = sc.nextInt();

                switch (select) {

                    case 1: toolStore.onLocation(player);
                        break LOCATION_LOOP;

                    case 2: safeHouse.onLocation(player);
                        break LOCATION_LOOP;

                    case 3: forest.onLocation(player);
                        break LOCATION_LOOP;

                    case 4: cave.onLocation(player);
                        break LOCATION_LOOP;

                    case 5: river.onLocation(player);
                        break LOCATION_LOOP;

                    default:
                        System.out.println("Yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");
                }
            }

            if (player.getHealth() == 0)
                break;
            }
    }
}








