package Java101.LoopStructures;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç Elemanlı Fibonacci Serisi: ");
        int n = sc.nextInt();
        int start = 0;
        int end = 1;

        for (int i = 1; i <= n; i++) {

            int sum = start + end;
            System.out.printf("%d + %d = %d%n",start,end,sum);
            start = end;
            end = sum;
        }
    }
}
