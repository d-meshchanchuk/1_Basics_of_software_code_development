package Loops;

import java.util.Arrays;
import java.util.Scanner;

/*
    Дана два числа. Определить цифры, входящие в запись как первого так и второго числа.
*/

public class Task08 {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        a = scanner.nextInt();
        System.out.println("Введите второе число:");
        b = scanner.nextInt();

        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    ch2[j] = ' ';
                    System.out.print(ch1[i] + " ");
                }
            }
        }
    }
}
