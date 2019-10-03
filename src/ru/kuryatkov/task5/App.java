package ru.kuryatkov.task5;
import java.util.Arrays;
import java.util.Scanner;

public class App {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(DrinksList.values()));
        int num = in.nextInt();


        DrinksList elem = DrinksList.getDrinkById(num);
        if (elem != null ) {
            System.out.println("Внесите деньги на счёт");
            int cash = in.nextInt();
            if (cash >= elem.getCost()) {
                System.out.println("Забирай и проваливай))) сдачи не будет!");
            } else {
                System.out.println("Не достаточно денег для покупки");
            }

        }        else {
            System.out.println("Нет такого напитка");
        }
    }



}
