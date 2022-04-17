package Java101.Basics;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {

        int math, physics, chemistry, turkish, history, music;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your math grade: ");
        math = Integer.parseInt(kb.nextLine());

        System.out.print("Enter your physics grade: ");
        physics = Integer.parseInt(kb.nextLine());

        System.out.print("Enter your chemistry grade: ");
        chemistry = Integer.parseInt(kb.nextLine());

        System.out.print("Enter your turkish grade: ");
        turkish = Integer.parseInt(kb.nextLine());

        System.out.print("Enter your history grade: ");
        history = Integer.parseInt(kb.nextLine());

        System.out.print("Enter your music grade: ");
        music = Integer.parseInt(kb.nextLine());

        int total = (math + physics + chemistry + turkish + history + music);
        double average = (double)total / 6.0;

        System.out.printf("GPA: %.2f%n" ,average);

        System.out.print(average > 60 ? "Gecti" : "Kaldı");
    }
}