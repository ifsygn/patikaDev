package Java101.Basics.HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {
    public static void main(String[]args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int H = sc.nextInt();

        if (B<=0 || H<=0)
        {
            Exception Exception = new Exception();
            throw Exception;
        }

        try {

        }

        catch(Exception e)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
