package Java101.Arrays;

import java.util.Arrays;

public class DuplicateNumbers {
    public static void main(String[]args) {

        //random bir dizi üretelim
        int [] rdArray = randomArray(20);
        System.out.println(Arrays.toString(rdArray));

        System.out.println("======================");

        findDuplicate(rdArray);
    }

    //dizide tekrarlayan sayıları tutan bir duplicate dizisi yaratalım.
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

    //dizide tekrarlayan çift sayıları tutan bir duplicate dizisi yaratalım.
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

    static int[] randomArray(int length) {

        int [] rdArray = new int[length];

        for (int i = 0; i < rdArray.length; i++) {
            rdArray[i] = (int)((Math.random()) * 10);
        }
        return rdArray;
    }

}