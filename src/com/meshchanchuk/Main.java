package com.meshchanchuk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(task_1_6());
    }

    //ЛИНЕЙНЫЕ ПРОГРАММЫ
    /*
    1.1 Найдите значение выражения z = ((a - 3) * b / 2) + c
     */
    public static double task_1_1() {

        double a;
        double b;
        double c;
        double z;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        z = ((a - 3) * b / 2) + c;
        return z;
    }

    /*
    1.2 Вычислить значение выражения по формуле (все переменные принимают действительные значения):
                            (b + sqrt(b**2 + 4ac)) / 2a - a**3c + b**-2
     */
    public static double task_1_2() {

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    /*
    1.3 Вычислить значение выражения по формуле (все переменные принимают действительные значения):
                            (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(xy)
     */
    public static double task_1_3() {

        double x;
        double y;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

    /*
   1.4 Дано действительное число R вида nnn.ddd(три цифры разряда в дробной и целой частях).
   Поменять местами дробную и целую части числа и вывести полученное значение числа
    */
    public static double task_1_4() {
        double r = 123.345;
        return (r * 1000) % 1000 + Math.floor(r) / 1000;
    }

    /*
       1.5 Дано действительное число T вида nnn.ddd(три цифры разряда в дробной и целой частях).
       Поменять местами дробную и целую части числа и вывести полученное значение числа
    */
    public static String task_1_5() {
        int t = 54631;
        int h = t / 3600;
        int m = (t - (h * 3600)) / 60;
        int s = (t - (h * 3600)) - (m * 60);
        return h + "ч " + m + "мин " + s + "с.";
    }

    /*
       1.6 Дано действительное число T вида nnn.ddd(три цифры разряда в дробной и целой частях).
       Поменять местами дробную и целую части числа и вывести полученное значение числа
    */
    public static boolean task_1_6() {
        int x = 2;
        int y = -3;

        return  (x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4);
    }
}



