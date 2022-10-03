package Java102.AdventureGame.Location;

public class Tools {
    int [][] gun;
    int [][] armor;
    int ID;
    int damage;
    int guard;
    int cost;

    Tools() {

    }

    Tools(Tools tools, int ID) {
        if (tools instanceof Gun) {

        }
        else if (tools instanceof Armor) {

        } else {
        }

    }
}

class Gun extends Tools {
    Gun () {
        {
            gun[0][0] = 1; gun [0][1] = 2; gun [0][2] = 25;
            gun[1][0] = 2; gun [1][1] = 3; gun [1][2] = 35;
            gun[2][0] = 3; gun [2][1] = 7; gun [2][2] = 45;
        }
    }
}

class Armor extends Tools {

    Armor() {

    }
}