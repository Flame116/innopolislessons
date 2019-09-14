package ru.kuryatkov.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваша зарплата без вычета налога: ");
        int zp = in.nextInt();
        double hand = zp * 0.87;
        System.out.printf("Зарплата на руки: %.2f рублей", hand);
        in.close();
    }
}
