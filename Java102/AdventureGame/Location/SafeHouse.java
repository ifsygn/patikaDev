package Java102.AdventureGame.Location;

import Java102.AdventureGame.Player.Player;

public class SafeHouse extends NormalLoc {

    Player player;

    public SafeHouse(){

    }
    public SafeHouse(Player player) {
        super();
        this.player = player;
    }

    public void onLocation(Player player) {
        this.player = player;
        System.out.println("You are in the SafeHouse.");
        regen();
    }

    private void regen() {

        if (player.inventory.water & player.inventory.food & player.inventory.firewoord) {
            player.setHealth(player.getStartHealth());
            System.out.println("Canınız yenilendi.\n" +
                    "Mevcut can:" + player.getHealth());
        } else {
            System.out.println("Canının yenilemek için yeterli envantere sahip değilsin!\n" +
                    "Yeterli miktarda suya, oduna ve yemeğe ihtiyacın var.\n" +
                    (player.inventory.water ? "Su yeterli" : "Su yetersiz\n") +
                    (player.inventory.food ? "Yemek yeterli" : "Yemek yetersiz\n") +
                    (player.inventory.firewoord ? "Yakacak Odun yeterli" : "Yakacak Odun yetersiz"));
        }
    }
}
