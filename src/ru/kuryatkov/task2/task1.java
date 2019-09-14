package ru.kuryatkov.task2;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Стоимость 1 литра бензина - 43 рубля");
        System.out.println("Сколько литров Вы хотите залить?: ");
        int a = 43;
        int b = in.nextInt();
        int cost = a * b;
        System.out.printf("К оплате: %d рублей", cost);
        in.close();
    }
}
