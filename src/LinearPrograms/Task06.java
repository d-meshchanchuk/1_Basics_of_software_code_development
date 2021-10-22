package LinearPrograms;

import java.util.Scanner;

/*
    Для данной области(смотри README.md) составить линейную программу, которая печатает true,
    если точка с координатами (х, у) принадлежит закрашенной области,
*/

public class Task06 {

    public static void main(String[] args) {
        int x;
        int y;
        boolean result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату х:");
        x = scanner.nextInt();
        System.out.println("Введите координату y:");
        y = scanner.nextInt();

        result = (x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4);

        if (result) {
            System.out.println("Точка (" + x + ", " + y + ") входит!");
        } else {
            System.out.println("Точка (" + x + ", " + y + ") не входит");
        }
    }
}
