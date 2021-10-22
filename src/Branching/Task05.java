package Branching;

import java.util.Scanner;

/*
    Вычислить значение функции:
             {x^2 - 3x + 9, если x <= 3;
     F(x) =  |
             {1/(x^3 + 6), если x > 3
*/

public class Task05 {

    public static void main(String[] args) {
        int x;
        double y;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        if (x > 3) {
            y = 1 / (Math.pow(x, 3) + 6);
        } else {
            y = Math.pow(x, 2) - 3 * x + 9;
        }

        System.out.println("Ответ: F(x) = " + y);
    }
}
