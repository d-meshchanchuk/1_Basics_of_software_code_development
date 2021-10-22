package Branching;

import java.util.Scanner;

/*
    Даны три точки A(x1,y1), B(x2,y2) и C(x3, y3). Определить, будут ли они расположены на одной прямой
*/

public class Task03 {

    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х1:");
        x1 = scanner.nextInt();
        System.out.println("Введите y1:");
        y1 = scanner.nextInt();
        System.out.println("Введите х2:");
        x2 = scanner.nextInt();
        System.out.println("Введите y2:");
        y2 = scanner.nextInt();
        System.out.println("Введите х3:");
        x3 = scanner.nextInt();
        System.out.println("Введите y3:");
        y3 = scanner.nextInt();

        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
