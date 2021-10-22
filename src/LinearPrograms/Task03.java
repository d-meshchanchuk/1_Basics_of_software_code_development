package LinearPrograms;

import java.util.Scanner;

/*
    Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(xy)
*/

public class Task03 {

    public static void main(String[] args) {
        double x;
        double y;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        x = scanner.nextDouble();
        System.out.println("Введите y:");
        y = scanner.nextDouble();

        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

        System.out.println("Ответ: " + result);
    }
}
