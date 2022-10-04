package Java102.AdventureGame.Location;

import javax.swing.text.TabableView;

public class Tools {

    /*
    static String [] armorID = {"0", "1", "2"};
    static String [] armorName = {"Hafif", "Orta","Ağır"};
    static String [] armorBlock = {"1","3","5"};
    static String [] armorCost = {"15","25","40"};

    static String [] weaponID = {"0", "1", "2"};
    static String [] weaponName = {"Tabanca","Kılıç","Tüfek"};
    static String [] weaponDamage = {"15","25","40"};
    static String [] weaponCost = {"25","35","45"};

    static String [][] armor = {armorID, armorName, armorBlock, armorCost};
    static String [][] weapon = {weaponID,weaponName, weaponDamage, weaponCost};
    static String [][][] tools = {weapon, armor};
     */

    static String [] armorID = {"ID","1", "2", "3"};
    static String [] armorName = {"Armor","Hafif", "Orta","Ağır"};
    static String [] armorBlock = {"Block","1","3","5"};
    static String [] armorCost = {"Cost","15","25","40"};

    static String [] weaponID = {"ID","1", "2", "3"};
    static String [] weaponName = {"Weapon","Tabanca","Kılıç","Tüfek"};
    static String [] weaponDamage = {"Damage","15","25","40"};
    static String [] weaponCost = {"Cost","25","35","45"};

    static String [][] armor = {armorID, armorName, armorBlock, armorCost};
    static String [][] weapon = {weaponID,weaponName, weaponDamage, weaponCost};
    static String [][][] tools = {weapon, armor};

    int ID;
    int damage;
    int guard;
    int cost;

    Tools() {

    }

    Tools(Tools tools, int ID) {

        if (tools instanceof Weapon) {

        }
        else if (tools instanceof Armor) {

        } else {
        }

    }
}

class Weapon extends Tools {

    Weapon() {
        {

        }
    }
}

class Armor extends Tools {

    Armor() {

    }
}