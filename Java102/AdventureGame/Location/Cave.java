package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Zombie;
import Java102.AdventureGame.Player.Player;

public class Cave extends BattleLoc {

    Cave() {

    }

    public Cave(Player player) {
        super();
    }

    public void onLocation(Player player) {
        player.inventory.food = true;
        System.out.println("You are in the Cave.");
        Zombie zombie = new Zombie();
        obstacle = zombie;

        System.out.println("Do you want to combat with " + obstacle.getName());
        if (sc.nextBoolean())
            combat(player, zombie);
    }
}
