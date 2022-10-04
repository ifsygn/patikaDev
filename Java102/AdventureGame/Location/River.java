package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Bear;
import Java102.AdventureGame.Player.Player;

import java.util.Scanner;

public class River extends BattleLoc {


    River() {

    }

    public River(Player player) {
        super();
    }

    public void onLocation(Player player) {
        player.inventory.water = true;
        System.out.println("You are in the River.");
        Bear bear = new Bear();
        obstacle = bear;

        System.out.println("Do you want to combat with " + obstacle.getName());
        if (sc.nextBoolean())
        combat(player, bear);
    }
}
