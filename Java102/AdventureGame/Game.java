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

        int select;

        for (;;) {

            LOCATION_LOOP:
            for (;;){

                System.out.print("Nereye gitmek istersiniz? \n" +
                        "1. ToolStore\n" +
                        "2. SafeHouse\n" +
                        "1. Forest\n" +
                        "2. Cave\n" +
                        "2. River\n" +
                        "?:");

                select = sc.nextInt();
                A:
                switch (select) {
                    case 1:
                        location = new ToolStore(player);

                        break LOCATION_LOOP;

                    case 2:
                        break LOCATION_LOOP;

                    case 3:
                        break LOCATION_LOOP;

                    case 4:
                        break LOCATION_LOOP;

                    case 5:
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








