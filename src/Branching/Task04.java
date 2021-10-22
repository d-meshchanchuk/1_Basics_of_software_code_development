package Branching;

import java.util.Scanner;

/*
    Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
    Определить, пройдет ли кирпич через отверстие
*/

public class Task04 {

    public static void main(String[] args) {
        int a;
        int b;
        int x;
        int y;
        int z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а:");
        a = scanner.nextInt();
        System.out.println("Введите b:");
        b = scanner.nextInt();
        System.out.println("Введите x:");
        x = scanner.nextInt();
        System.out.println("Введите y:");
        y = scanner.nextInt();
        System.out.println("Введите z:");
        z = scanner.nextInt();

        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Кирпич пройдет");
        } else {
            System.out.println("Кирпич не пройдет");
        }
    }
}
