package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Zombie;
import Java102.AdventureGame.Player.Player;

public class Cave extends BattleLoc {

    public Cave(Player player) {
        super();
    }

    public void onLocation(Player player) {
        player.inventory.food = true;
        System.out.println("You are in the Cave.");
        Zombie zombie = new Zombie();
        obstacle = zombie;

        int min = 1;
        int max = 4;
        int numberOfObstacle = random.nextInt(max - min) + min; //[min, max)

        System.out.printf("Karşında %d tane %s var.",numberOfObstacle,obstacle.getName());
        obstacle = zombie;
        obstacle.setDamage(obstacle.getDamage() * numberOfObstacle);
        obstacle.setHealth(obstacle.getHealth() * numberOfObstacle);
        obstacle.setMoney(obstacle.getMoney() * numberOfObstacle);

        System.out.println("Do you want to combat with " + obstacle.getName());
        if (sc.nextBoolean())
            combat(player, zombie);
    }
}
