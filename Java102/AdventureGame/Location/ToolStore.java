package Java102.AdventureGame.Location;

import Java102.AdventureGame.Inventory;
import Java102.AdventureGame.Player.Player;

public class ToolStore extends NormalLoc {

    static String [] armorID = {"ID","1", "2", "3"};
    static String [] armorName = {"Armor","Hafif", "Orta","Ağır"};
    static String [] armorBlock = {"Block","1","3","5"};
    static String [] armorCost = {"Cost","15","25","40"};

    static String [] weaponID = {"ID","1", "2", "3"};
    static String [] weaponName = {"Weapon","Tabanca","Kılıç","Tüfek"};
    static String [] weaponDamage = {"Damage","15","25","40"};
    static String [] weaponCost = {"Cost","25","35","45"};

    static String [][] weapon = {
            {"ID","Weapon","Damage","Cost"},
            {"1","Tabanca","15","25"},
            {"2","Kılıç","25","35"},
            {"3","Tüfek","40","45"}
    };

    static String [][] armor = {
            {"ID","Armor","Block","Cost"},
            {"1","Hafif","1","15"},
            {"2","Orta","3","25"},
            {"3","Ağır","5","40"}
    };

    /*
    static String [][] armor = {armorID, armorName, armorBlock, armorCost};
    static String [][] weapon = {weaponID,weaponName, weaponDamage, weaponCost};
     */
    static String [][][] tools = {weapon, armor};

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

        for (int i = 0; i < tools[menuNo].length; i++) {
            for (int j = 0; j < tools[menuNo][0].length; j++) {
                System.out.printf("%-10s", tools[menuNo][i][j]);
            }
            System.out.println();
        }


        System.out.print("Bir şey almak için 1'e çıkmak için 0'a basın: ");
        int select = sc.nextInt();
        if (select == 1)
            buy(menuNo, player);
        else
            return;
    }

    public void buy(int menuNo, Player player) {

        int selectedID;
        do {
            System.out.println("Hangisini almak istiyorsunuz? : ");
            selectedID = sc.nextInt();
            if (selectedID <= 0 || selectedID >= tools[menuNo].length)
                System.out.println("Yanlış giriş yaptınız !");
            else break;
        } while (true);

        if (player.getMoney() > Integer.parseInt(tools[menuNo][selectedID][3])) {
            player.setMoney(player.getMoney() - Integer.parseInt(tools[menuNo][selectedID][3]));
        } else {
            System.out.println("Yeterli paranız yok!\n" +
                    "Mevcut paranız: " + player.getMoney());
            return;
        }

        if (menuNo == 0) { //weapon

            player.inventory.weaponName = tools[menuNo][selectedID][1];
            System.out.printf("Seçtiğiniz silah : %s%n",player.inventory.weaponName);
            player.inventory.weaponDamage = Integer.parseInt(tools[menuNo][selectedID][2]);
        } else if (menuNo == 1) { //armor
            player.inventory.armorName = tools[menuNo][selectedID][1];
            System.out.printf("Seçtiğiniz silah : %s",player.inventory.armorName);
            player.inventory.armorDefence = Integer.parseInt(tools[menuNo][selectedID][2]);
        } else {
            System.out.println("Menüyü yanlış girdiniz.");
        }
    }
}