/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir).
Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.

Senaryo

Matris
2    3    4
5    6    4
Transpoze
2    5
3    6
4    4

Matris
1    2    3
4    5    6

Transpoze
1    4
2    5
3    6
 */

package Java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TranspozeMatrix {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("m: ");
        int m = sc.nextInt();
        System.out.print("n: ");
        int n = sc.nextInt();

        int[][] rdMatrix = randomMatrix(m,n);

        System.out.println("=========printMatrix=========");
        printMatrix(rdMatrix);
        System.out.println("-----------------------------");
        printMatrix(transpoze(rdMatrix));

        System.out.println("=========toString=========");
        System.out.print(toString(rdMatrix));
        System.out.println("-----------------------------");
        System.out.print(toString(transpoze(rdMatrix)));
    }

    static int[][] transpoze(int[][] array) {

        int m = array.length;
        int n = array[0].length;
        int [][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = array[j][i];
            }
        }

        return result;
    }

    //Belirli bir uzunluğa göre 0-10 arasında sayılardan oluşan random dizi üretir.

    static int[][] randomMatrix(int m, int n) {

        int [][] rdArray = new int[m][n];

        for (int i = 0; i < rdArray.length; i++) {
            for(int j = 0; j < rdArray[0].length; j++){
                rdArray[i][j] = (int) ((Math.random()) * 10);
            }
        }
        return rdArray;
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

}
