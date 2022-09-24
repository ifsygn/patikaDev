package Java101.Classes.BoxGameApp;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        int i = 1;

        if(isCheck()) {
            if (whoStart() == f1) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.printf("==== %d. ROUND ====%n",i++);
                    this.f2.health = this.f1.hit(f2);
                    if (isWin())
                        break;
                    this.f1.health = this.f2.hit(f1);
                    if (isWin())
                        break;
                    System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                }
            } else {
                while (this.f1.health > 0 && this.f2.health > 0) {

                    System.out.printf("==== %d. ROUND ====%n",i++);
                    this.f1.health = this.f2.hit(f1);
                    if (isWin())
                        break;

                    this.f2.health = this.f1.hit(f2);
                    if (isWin())
                        break;
                    System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                }
            }
        } else {
          System.out.println("Sporcuların sikletleri uymuyor");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight &&
                this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " kazandı.");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " kazandı.");
            return true;
        }
        return false;
    }

    Fighter whoStart() {
        if(Math.random() * 100 > 50) {
            System.out.println("İlk yumruk " + f2.name);
            return f2;
        }
        System.out.println("İlk yumruk " + f1.name);
        return f1;
    }
}
