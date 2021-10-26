package Loops;

/*
    Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    Взял таблицу ASCII (печатные символы 32 - 126)
 */

public class Task06 {

    public static void main(String[] args) {
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
}
