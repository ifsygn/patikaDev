package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Bear;
import Java102.AdventureGame.Player.Player;

import java.util.Scanner;

public class River extends BattleLoc {

    public River(Player player) {
        super();
    }

    public void onLocation(Player player) {
        player.inventory.water = true;
        System.out.println("You are in the River.");
        Bear bear = new Bear();
        obstacle = bear;

        int min = 1;
        int max = 4;
        int numberOfObstacle = random.nextInt(max - min) + min; //[min, max)

        System.out.printf("Karşında %d tane %s var.",numberOfObstacle,obstacle.getName());
        obstacle = bear;
        obstacle.setDamage(obstacle.getDamage() * numberOfObstacle);
        obstacle.setHealth(obstacle.getHealth() * numberOfObstacle);
        obstacle.setMoney(obstacle.getMoney() * numberOfObstacle);

        System.out.println("Do you want to combat with " + obstacle.getName());
        if (sc.nextBoolean())
        combat(player, bear);
    }
}
