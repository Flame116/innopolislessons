package ru.kuryatkov.task10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;

public class App {


        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(DrinksList.values()));
        int num = in.nextInt();


        DrinksList elem = DrinksList.getDrinkById(num);
        logger.info("start program");
        if (elem != null ) {
            System.out.println("Внесите деньги на счёт");
            int cash = in.nextInt();
            if (cash >= elem.getCost()) {
                logger.info("Good work! Внесено = " + cash);
                System.out.println("Забирай и проваливай))) сдачи не будет!");
            } else {
                logger.warn("Insufficient funds! Внесено = " + cash);
                System.out.println("Не достаточно денег для покупки");
            }

        }        else {
            logger.error("Выбран неверный номер =" + num);
            System.out.println("Нет такого напитка");
        }


    }
    public static Logger logger = LoggerFactory.getLogger(App.class);





}
