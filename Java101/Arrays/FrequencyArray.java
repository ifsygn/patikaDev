/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini
yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */

package Java101.Arrays;

import java.util.Arrays;

public class FrequencyArray {
    public static void main(String [] args) {

        int[] rdArray = ArrayUtil.randomArray(10);
        System.out.println(Arrays.toString(rdArray));
        printFrequency(rdArray);
    }

    static void printFrequency(int [] array) {

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    count++;
                }
            }
            if (isFindBefore(array, i))
                continue;
            System.out.printf("%d sayısı %d kere tekrar edildi.%n", array[i], count);
        }
    }

    static boolean isFindBefore(int[] array, int i) {

        for (int j = 0; j < i; j++) {
            if (array[j] == array[i])
                return true;
        }
        return false;
    }
}
