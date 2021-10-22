package LinearPrograms;

/*
    Дано действительное число R вида nnn.ddd(три цифры разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа
*/

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        double r;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительное число вида nnn,ddd(три цифры разряда в дробной и целой частях):");
        r = scanner.nextDouble();

        result = (r * 1000) % 1000 + Math.floor(r) / 1000;

        System.out.println("Ответ: " + result);
    }
}
