/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

Senaryo
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

 */
package Java101.LoopStructures;

import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String []args)
    {
         for (int i = 1; i <= 100; i++) {
            if (isPrime(i))
                System.out.printf("%d ",i);
        }
    }
    static boolean isPrime(int val)
    {
        if (val == 1)
            return false;
        if (val == 2)
            return true;
        if (val == 3)
            return true;
        if (val == 5)
            return true;
        if (val == 7)
            return true;
        if (val == 11)
            return true;

        for (int i = 2; i <= val ; ++i) {
            if (val % i == 0 && i != val)
                return false;
            else if (val % i == 0 && i == val)
                return true;
        }
        return false;
    }
}