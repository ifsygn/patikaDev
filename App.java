/*
    ATM Projesi
 */

import java.util.*;

public class App {
    public static String LetterCapitalize(String str) {
        // code goes here

        char [] result = str.toCharArray();
        char [] upperResult = (str.toUpperCase()).toCharArray();

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            String temp = result[i] + "";
            if (i == 0) {
                result[i] = upperResult[i];
            }

            else if(temp.equals(" ")) {
                result[i + 1] = upperResult[i + 1];
            }

            answer.append(result[i]);
        }
        return answer.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }//end of main
}//end of// class
