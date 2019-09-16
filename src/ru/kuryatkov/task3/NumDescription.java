package ru.kuryatkov.task3;
import java.util.Scanner;


public class NumDescription {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        if (a == 0) {
            System.out.println("Вы ввели ноль");
        }
        else if (a % 2 == 0 && a < 0) {
            System.out.println("Введёное число чётное и меньше нуля: " + a);
        }
        else if (a % 2 != 0 && a < 0) {
            System.out.println("Введёное число нечётное и меньше нуля: " + a);
        }
        else if (a % 2 == 0 && a > 0) {
            System.out.println("Введёное число чётное и больше нуля: " + a);
        }
        else  {
            System.out.println("Введёное число нечётное и больше нуля: " + a);
        }
    }
}

