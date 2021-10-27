package Loops;

import java.util.Scanner;

/*
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
*/

public class Task07 {

    public static void main(String[] args) {
        int m;
        int n;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите m:");
        m = scanner.nextInt();
        System.out.println("Введите n:");
        n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            c = m;
            System.out.print("Делители числа " + i + ": ");
            while (i > c) {
                if (i % c == 0 && c != 1) {
                    System.out.print(c + " ");
                }
                c++;
            }

            System.out.println();
        }
    }
}
