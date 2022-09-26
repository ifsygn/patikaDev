package Java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {

    //Dizi elemanlarının ortalamasını hesaplar.
    static double average(int[] array) {
        double sum = 0.0;

        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    //Kullanıcıdan alınan bilgilerle dizi yaratır.
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

    //Verilen sayıya dizideki en yakın 2 sayıyı ekrana basar.
    static void findCloseValues(int[] array, int value) {
        Arrays.sort(array);

        int startData = 0;
        int endData = array.length - 1;

        int min = array[endData];
        int max = array [startData];

        for (int i = 0 ; i < array.length; i++) {
            if(value < min) {
                min = array[endData--];
            }
            if (value > max) {
                max = array[startData++];
            }
        }
        System.out.println("Minimum değer: " + min + "Maximum değer: " + max);
    }

    //Dizideki sayıların harmonik ortalamasını hesaplayan program
    static double harmonicArrayAvarage(int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += 1.0 / array[i];
        }
        return (double) array.length / sum;
    }

    //Dizide tekrarlayan sayıları tutan dizi
    static void findDuplicate(int [] array) {

        int [] duplicate = new int[array.length];
        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if ((i != j) && (array[i] == array[j])) {
                    if (!isFind(duplicate, array[i])) {
                        duplicate[startIndex++] =  array[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(removeNumbers(duplicate, 0)));
    }

    //Dizide tekrarlayan çift sayıları tutan dizi
    static void findDuplicateEvenNumber(int [] array) {

        int [] duplicate = new int[array.length];
        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if ((i != j) && (array[i] == array[j])) {
                    if (!isFind(duplicate, array[i])) {
                        if (isEven(array[i]))
                            duplicate[startIndex++] =  array[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(removeNumbers(duplicate, 0)));
    }

    //TODO
    static void findFrequency(int [] array) {

        int [] frequency = new int[array.length];
        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if ((i != j) && (array[i] == array[j])) {
                    frequency[startIndex++] =  array[i];
                    break;
                }
            }
        }
        frequency = ArrayUtil.sort(frequency);
        System.out.println(Arrays.toString(frequency));
    }

    //Dizide elemanların kaç kez tekrar edildiğini ekrana basar.
    static void printFrequency(int [] array) {

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    count++;
                }
            }
            if (ArrayUtil.isFindBefore(array, i))
                continue;
            System.out.printf("%d sayısı %d kere tekrar edildi.%n", array[i], count);
        }
    }

    static boolean isEven (int val) {
        if (val % 2 == 0) {
            return true;
        }
        return false;
    }

    static boolean isFind(int[] array, int val) {
        for (int i : array) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }

    static boolean isFindBefore(int[] array, int i) {

        for (int j = 0; j < i; j++) {
            if (array[j] == array[i])
                return true;
        }
        return false;
    }

    //Belirli bir uzunluğa göre 0-10 arasında sayılardan oluşan random dizi üretir.
    static int[] randomArray(int length) {

        int [] rdArray = new int[length];

        for (int i = 0; i < rdArray.length; i++) {
            rdArray[i] = (int)((Math.random()) * 10);
        }
        return rdArray;
    }

    //Belirlenen satır ve sütun sayısına göre 0-10 arasında sayılardan oluşan random dizi üretir.
    static int[][] randomMatrix(int m, int n) {

        int [][] rdArray = new int[m][n];

        for (int i = 0; i < rdArray.length; i++) {
            for(int j = 0; j < rdArray[0].length; j++){
                rdArray[i][j] = (int) ((Math.random()) * 10);
            }
        }
        return rdArray;
    }

    //Diziden bir sayıyı silen program
    static int[] removeNumbers(int[] array, int number) {

        int length = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] != number)
                length++;
        }

        int [] rmArr = new int[length];

        for (int i=0, j=0; i < array.length; i++){
            if (array[i] != number) {
                rmArr[j] = array[i];
                j++;
            }
        }
        return rmArr;
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

    public static void printMatrix(int[][] matrix) {
        if (matrix == null)
            System.out.print("null");
        int iMax = matrix.length - 1;
        if (iMax == -1)
            System.out.print("[]");

        int jMax = matrix[0].length - 1;
        if (jMax == -1)
            System.out.print("[]");

        for (int i = 0; i < matrix.length; i++){
            System.out.print('[');
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print((matrix[i][j]));
                if (j == jMax)
                    System.out.print(']');
                else System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(String[][] matrix) {
        if (matrix == null)
            System.out.print("null");
        int iMax = matrix.length - 1;
        if (iMax == -1)
            System.out.print("[]");

        int jMax = matrix[0].length - 1;
        if (jMax == -1)
            System.out.print("[]");

        for (int i = 0; i < matrix.length; i++){
            System.out.print('[');
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print((matrix[i][j]));
                if (j == jMax)
                    System.out.print(']');
                else System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static String toString(int[][] matrix) {
        if (matrix == null)
            return "null";
        int iMax = matrix.length - 1;
        if (iMax == -1)
            return "[]";

        int jMax = matrix[0].length - 1;
        if (jMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();

        for (int i = 0; i < matrix.length; i++){
            b.append('[');
            for (int j = 0; j < matrix[i].length ; j++) {
                b.append(matrix[i][j]);
                if (j == jMax)
                    b.append(']');
                else b.append(", ");
            }
            b.append("\n");
        }
        return b.toString();
    }

    public static String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    static int[][] transpoze(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int [][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}
