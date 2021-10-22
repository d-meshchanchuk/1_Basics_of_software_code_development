package Branching;

import java.util.Scanner;

/*
    Найти max{min(a,b), min(c,d)}
*/

public class Task02 {

    public static void main(String[] args) {
        int a = 30;
        int b = 60;
        int d = 23;
        int c = 21;
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а:");
        a = scanner.nextInt();
        System.out.println("Введите b:");
        b = scanner.nextInt();
        System.out.println("Введите c:");
        c = scanner.nextInt();
        System.out.println("Введите d:");
        d = scanner.nextInt();

        result = Math.max(Math.min(a, b), Math.min(c, d));

        System.out.println("max = " + result);
    }
}
