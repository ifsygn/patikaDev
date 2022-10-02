package Java102.Initializers;

public class App {
    public static void main(String[] args) {

        InstanceBlockExample A = new InstanceBlockExample();
        InstanceBlockShows B = new InstanceBlockShows();

        System.out.println("Main Method");
    }

    public void print() {
       InstanceBlockExample.ex();
    }
}
class InstanceBlockExample {

    {
        System.out.println("InstanceBlockExample initializer block 1");
    }

    {
        System.out.println("InstanceBlockExample initializer block 2");
    }
    public InstanceBlockExample() {
        System.out.println("InstanceBlockExample constructor");
        String D = "E";
        InstanceBlockExample C = new InstanceBlockExample(D);
    }
    public InstanceBlockExample(String D) {
        System.out.println("InstanceBlockExample(String) constructor");
        System.out.println(D);
    }
    public static void ex(){

    }
}

class InstanceBlockShows extends InstanceBlockExample {
    {
        System.out.println("InstanceBlockShows initializer block 1");
    }

    {
        System.out.println("InstanceBlockShows initializer block 2");
    }
    public InstanceBlockShows() {
        System.out.println("InstanceBlockShows constructor");
    }
}