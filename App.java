import java.util.*;

public class App {
    public static void main(String[] args)
    {


    }//end of main

    static void splitRegex(String str, String regex) {
        String[] strArray = str.split(regex);
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}//end of// class
