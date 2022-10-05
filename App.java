import java.util.*;

public class App {
    public static void main(String[] args)
    {
        String s = "a/b/c/d";
        String[] a1 = s.split("/");
        System.out.println("split string using only regex:");
        for (String string : a1) {
            System.out.println(string);
        }
        System.out.println("split string using regex with limit:");
        String[] a2 = s.split("/", 6);
        for (String string : a2) {
            System.out.println(string);
        }
    }//end of main
}//end of// class
