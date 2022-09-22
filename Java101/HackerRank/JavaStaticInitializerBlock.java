/*
https://www.hackerrank.com/challenges/java-static-initializer-block/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
Java Static Initializer Block

Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method.
Complete the given code so that it outputs the area of a parallelogram with breadth B and height H.
You should read the variables from the standard input.
 */
package Java101.HackerRank;

import java.util.*;

public class JavaStaticInitializerBlock {
    //Write your code here

    public static Scanner sc = new Scanner(System.in);
    public static int B = 1;
    public static int H = 2;
    public static boolean flag = false;

    static {
        System.out.printf("B: %d%n", B);
        System.out.print("Yeni B değerini giriniz: ");
        B = sc.nextInt();
        System.out.printf("H: %d%n", H);
        System.out.print("Yeni H değerini giriniz: ");
        H= sc.nextInt();
        flag = request();
    }

    private static boolean request()
    {
        boolean flag = true;

        if (B <=0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        return flag;
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

