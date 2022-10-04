package Java102.AdventureGame.Location;

import Java102.AdventureGame.Inventory;
import Java102.AdventureGame.Player.Player;
import Java102.AdventureGame.Location.Tools;
import java.util.Scanner;

public class ToolStore extends NormalLoc {
    Inventory inventory;
    private static Scanner sc = new Scanner(System.in);


    public ToolStore() {

    }

    public ToolStore(Player player) {
        this(player, player.inventory);
        //...
    }

    public ToolStore(Player player, Inventory inventory) {

    }

    public boolean onLocation(Player player) {
        System.out.println("You are in the ToolStore.");
        menu(player);
        return true;
    }

    //menu shows the tools in the ToolStore.
    public void menu(Player player) {

        //Tools.tools = {"weapon","armor"};
        System.out.print("------------------------------\n"
                + "Menüye hoşgeldiniz.\n"
                + "1. Silah menüsü\n"
                + "2. Zırh menüsü\n"
                + "Hangi menüyü görmek istiyorsunuz? :");
        int menuNo = sc.nextInt() - 1;

        for (int i = 0; i < Tools.tools[menuNo][0].length; i++) {
            for (int j = 0; j < Tools.tools[menuNo].length; j++) {
                System.out.printf("%-10s", Tools.tools[menuNo][i][j]);
            }
            System.out.println();
        }
        buy(menuNo, player);
    }

    public void buy(int menuNo, Player player) {

        int selectedID;
        System.out.println("Çıkmak için 'sıfıra' basınız\n" +
                "Hangisini almak istiyorsunuz? : ");
        selectedID = sc.nextInt();
        if (selectedID == 0)
            return;

        if (player.getMoney() > Integer.parseInt(Tools.tools[menuNo][3][selectedID])) {
            player.setMoney(player.getMoney() - Integer.parseInt(Tools.tools[menuNo][3][selectedID]));
        } else {
            System.out.println("Yeterli paranız yok!\n" +
                    "Mevcut paranız: " + player.getMoney());
            return;
        }

        if (menuNo == 0) { //weapon

            player.inventory.weaponName = Tools.tools[menuNo][1][selectedID];
            System.out.printf("Seçtiğiniz silah : %s%n",player.inventory.weaponName);
            player.inventory.weaponDamage = Integer.parseInt(Tools.tools[menuNo][2][selectedID]);
        } else if (menuNo == 1) { //armor
            player.inventory.armorName = Tools.tools[menuNo][1][selectedID];
            System.out.printf("Seçtiğiniz silah : %s",player.inventory.armorName);
            player.inventory.armorDefence = Integer.parseInt(Tools.tools[menuNo][2][selectedID]);
        } else {
            System.out.println("Menüyü yanlış girdiniz.");
        }
    }
}

