package Java101.GraduationProject;

import Java101.Arrays.ArrayUtil;
import java.util.Scanner;

public class MineSweeperGame {
    public static void main(String[]args) {
        play();
    }

    public static void play() {

        Scanner sc = new Scanner(System.in);
        int width = 0;
        int height = 0;
        double percentage = 0.25;
        String difficulty;
        String size;
        MineMap map;

        System.out.print("Hangi tür mayın tarlası oynamak istersiniz?\n" +
                "Klasik / Özel: ");
        String gameType = sc.nextLine();

        while (true){
            if (gameType.equals("Özel")) {

                System.out.print("Width: ");
                width = sc.nextInt();
                System.out.print("Height: ");
                height = sc.nextInt();
                System.out.print("Difficulty percentage: ");
                percentage = sc.nextDouble();

                map = new MineMap(width, height, percentage);
                break;

            } else if (gameType.equals("Klasik")) {
                System.out.print("Difficulty: Easy/Medium/Hard -> ");
                difficulty = sc.nextLine();
                System.out.print("Size: Small/Medium/Large -> ");
                size = sc.nextLine();

                if (size.equals("Small")) {
                    width = 3; height = 3;
                } else if (size.equals("Medium")) {
                    width = 4; height = 4;
                } else if (size.equals("Large")) {
                    width = 5; height = 5;
                } else {
                    System.out.println("Yanlış giriş yaptınız.");
                    continue;
                }

                if (difficulty.equals("Easy")) {
                    percentage = 0.20;
                } else if (difficulty.equals("Medium")) {
                    percentage = 0.35;
                } else if (difficulty.equals("Hard")) {
                    percentage = 0.50;
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                    continue;
                }
                map = new MineMap(width, height, percentage);
                break;

            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }
        }

        for (;;) {
            System.out.print("Satır giriniz: ");
            int x = sc.nextInt();
            System.out.print("Sütun giriniz: ");
            int y = sc.nextInt();

            if (x >= width || y >= height || x < 0 || y < 0) {
                System.out.println("Yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");
                continue;
            }
            System.out.println("\n===================");

            map.select(x,y);
        }
    }
}

class MineMap {

    double percentage;
    String[][] mineMatrix;
    String[][] shadowedMatrix;

    MineMap(int width, int height, double percentage) {
        mineMatrix = new String[width][height];
        shadowedMatrix = new String[width][height];
        designMap(width,height,percentage);
    }

    // difficulty means the percentage of mine / mapArea
    // size means that 3x3 - 4x4 - 5x5
    // creates MineMap with these combination

    public void countMines(int x, int y) {

        int count = 0;

        int i,j;

        if (x == 0) {
            i = 0;
        } else i = x - 1;

        for (; i < Math.min(mineMatrix.length, x + 2); i++) {

            if (y == 0) {
                j = 0;
            } else j = y - 1;

            INSIDE:
            for (; j < Math.min(mineMatrix[0].length, y + 2); j++) {

                if (i == x && j == y) {
                    continue INSIDE;
                }
                else if (!isSafe(i,j)) {
                    count++;
                }
            }
        }

        String replace =  String.valueOf(count);

        System.out.println("countMines çıktı: " + replace);

        shadowedMatrix[x][y] = replace;
        mineMatrix[x][y] = replace;
    }

    //overloading
    public void designMap(int width, int height) {
        designMap(width, height, 0.25);
    }
    // Haritayı aldığı orana göre mayınla tarar.
    public void designMap(int width, int height, double percentage) {

        for (int i = 0; i < mineMatrix.length; i++) {
            for (int j = 0; j < mineMatrix[0].length; j++) {
                mineMatrix[i][j] = "-";
                shadowedMatrix[i][j] = "-";
            }
        }

        int numberOfMines = (int) Math.floor(width * height * percentage);

        for (int count = 0; count <= numberOfMines;) {
            int i =  (int)(Math.random() * (mineMatrix.length));
            int j =  (int)(Math.random() * (mineMatrix[0].length));

            String randomMine = mineMatrix[i][j];

            if(randomMine.equals("*")) {
                continue;
            } else {
                mineMatrix[i][j] = "*";
                count++;
            }
        }
    }

    public boolean isSafe(int x, int y) {
        String select = mineMatrix[x][y];
        return !select.equals("*");
    }

    // Seçilen yerin mayınlı olup olmadığını kontrol eder.
    // Mayın yoksa true, Mayın varsa false döner ve oyuncu kaybeder.
    public void printMatrix(String[][] matrix) {
        ArrayUtil.printMatrix(matrix);
    }

    public void select(int x, int y) {

        if (isSafe(x,y)) {
            countMines(x,y);
            printMatrix(shadowedMatrix);
        } else {
            System.out.println("BOOOOM\n" +
                    "GAME is OVER !!!");
            printMatrix(mineMatrix);
        }
    }
    // seçilen noktanın etrafındaki mayınları sayar ve int değer üretir, String olarak döner.

}
