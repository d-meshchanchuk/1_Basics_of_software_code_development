package Loops;

import java.util.Scanner;

/*
    Вычислить значения функции на отрезке [a, b] с шагом h:
        { x, x > 2
    y = |
        { -x, x <= 2
*/

public class Task02 {

    public static void main(String[] args) {
        int a;
        int b;
        double y;
        double x;
        double h;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а:");
        a = scanner.nextInt();
        System.out.println("Введите b:");
        b = scanner.nextInt();
        System.out.println("Введите h:");
        h = scanner.nextDouble();

        for (x = a; x <= b - h; x += h) {
            System.out.print("x= " + x + ",");
            if (x < 0.5) {
                y = Math.sqrt(x) * h;
                System.out.println("y = " + y);
            } else if (x >= 0) {
                y = Math.exp(x);
                System.out.println("y = " + y);
            }
        }
    }
}
