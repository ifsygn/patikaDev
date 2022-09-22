/*

https://www.hackerrank.com/challenges/java-if-else/problem

In this challenge, we test your knowledge of using if-else conditional statements
to automate decision-making processes. An if-else statement has the following logical flow:

Task
Given an integer, n, perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

 */
package Java101.HackerRank;

import java.util.Scanner;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0)
            System.out.print("Weird");
        else if (N >= 2 && N <= 5)
            System.out.print("Not Weird");
        else if (N >= 6 && N <= 20)
            System.out.print("Weird");
        else if (N >20)
            System.out.print("Not Weird");
        scanner.close();
    }
}
