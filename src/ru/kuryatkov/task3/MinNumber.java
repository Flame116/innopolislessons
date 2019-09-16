package ru.kuryatkov.task3;
import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа для определения минимального числа из двух");
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        if (a < b) {
            System.out.println("Первое число " + a + " меньше второго числа " + b);
        }  else {
            System.out.println("Второе число " + b + " меньше первого числа " + a);
        }
        in.close();

    }


}
