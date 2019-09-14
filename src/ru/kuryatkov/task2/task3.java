package ru.kuryatkov.task2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд, чтобы перевести в часы: ");
        int a = in.nextInt();
        int b = 3600;
        int c = a / b;
        System.out.printf("Часов: %d", c);
    }

}
