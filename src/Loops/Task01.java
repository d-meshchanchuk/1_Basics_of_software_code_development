package Loops;

import java.util.Scanner;

/*
    Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.
*/

public class Task01 {

    public static void main(String[] args) {
        int x;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            sum += i;
        }

        System.out.println("Ответ: F(x) = " + sum);
    }
}
