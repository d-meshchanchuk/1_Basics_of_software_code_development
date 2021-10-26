package Loops;

import java.util.Scanner;

/*
    Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид:   a =  1/2^n + 1/3^n
 */

public class Task05 {

    public static void main(String[] args) {
        double e;
        int n = 0;
        double sum = 0;
        double a = (1/Math.pow(2,n))+ (1/Math.pow(3,n));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите е:");
        e = scanner.nextDouble();

        while (e <= Math.abs(a)){
            a = (1/Math.pow(2,n))+ (1/Math.pow(3,n));
            sum = sum+a;
            n++;
        }

        System.out.println(sum);
    }
}
