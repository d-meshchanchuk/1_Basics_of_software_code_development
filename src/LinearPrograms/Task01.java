package LinearPrograms;

import java.util.Scanner;

//Найдите значение выражения z = ((a - 3) * b / 2) + c

public class Task01 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите а:");
        a = scanner.nextDouble();
        System.out.println("Введите b:");
        b = scanner.nextDouble();
        System.out.println("Введите c:");
        c = scanner.nextDouble();
        z = ((a - 3) * b / 2) + c;

        System.out.println("Ответ: " + z);
    }
}
