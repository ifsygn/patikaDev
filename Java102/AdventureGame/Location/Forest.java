package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Vampire;
import Java102.AdventureGame.Player.Player;

public class Forest extends BattleLoc {

    public Forest(Player player) {
        super();
    }

    public void onLocation(Player player) {
        player.inventory.firewoord = true;
        System.out.println("You are in the Forest.");
        Vampire vampire = new Vampire();

        int min = 1;
        int max = 4;
        int numberOfObstacle = random.nextInt(max - min) + min; //[min, max)

        System.out.printf("Karşında %d tane %s var.",numberOfObstacle,obstacle.getName());
        obstacle = vampire;
        obstacle.setDamage(obstacle.getDamage() * numberOfObstacle);
        obstacle.setHealth(obstacle.getHealth() * numberOfObstacle);
        obstacle.setMoney(obstacle.getMoney() * numberOfObstacle);

        System.out.println("Do you want to combat with " + obstacle.getName()
        + "\nYes / No");

        for (;;){
            if (sc.next() == "Yes")
                combat(player, vampire);
            else if (sc.next() == "No") {
                System.out.print("Savaşmadan ayrılabilirsiniz.");
                break;
            } else {
                System.out.print("Yanlış giriş yaptınız.");
                continue;
            }
        }
    }
}
