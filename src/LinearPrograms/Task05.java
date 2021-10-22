package LinearPrograms;

import java.util.Scanner;

 /*
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSс.
 */

public class Task05 {

    public static void main(String[] args) {
        int t;
        int h;
        int m;
        int s;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число Т:");
        t = scanner.nextInt();

        h = t / 3600;
        m = (t - (h * 3600)) / 60;
        s = (t - (h * 3600)) - (m * 60);

        System.out.println(h + "ч " + m + "мин " + s + "с.");
    }
}
