/*
Java dilinde, dizideki elemanları küıçükten büyüğe sıralayan programı yazınız.
Dizinin boyutunu ve dizinin elemanlarnı kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99


Dizinin boyutu n : 6
Dizinin elemanlarını giriniz :
1. Elemanı : 1000221
2. Elemanı : 22
3. Elemanı : -1
4. Elemanı : 999
5. Elemanı : 0
6. Elemanı : 254
Sıralama : -1 0 22 254 999 1000221
 */

package Java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String [] args) {

        System.out.println(Arrays.toString(sort(createArray())));
    }

    static int[] createArray() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = sc.nextInt();
        System.out.println();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.printf("array[%d]: ",i);
            array[i] = sc.nextInt();
        }
        return array;
    }

    static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
