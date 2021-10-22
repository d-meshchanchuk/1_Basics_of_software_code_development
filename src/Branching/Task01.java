package Branching;

import java.util.Scanner;

/*
    Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
    то будет ли он прямоугольным
*/

public class Task01 {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите градус первого угла:");
        a = scanner.nextInt();
        System.out.println("Введите градус второго угла:");
        b = scanner.nextInt();

        if (a + b >= 180) {
            System.out.println("Треугольник не существует");
        } else if (a + b == 90 || a == 90 || b == 90) {
            System.out.println("Треугольник существует и является прямоугольным");
        } else {
            System.out.println("Треугольник существует");
        }
    }
}
