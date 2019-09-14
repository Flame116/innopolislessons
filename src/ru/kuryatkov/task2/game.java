package ru.kuryatkov.task2;

import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random randZn = new Random();
        int tryes =0;
        int rndNum = randZn.nextInt(100)+1;
        int prefnum = 0;
        int tryTo;

        boolean win = false;

        while(win == false)
        {
            System.out.println("Угадайте загаданное число от 1 до 100: ");
            tryTo = in.nextInt();
            tryes++;
            if (tryTo < 0)
            {
                System.out.println("Жаль, что вы решили выйти");
                break;
            }

            if(tryTo == rndNum)
            {
                win = true;
                System.out.println("Вы угадали!");
            }
            else if (Math.abs(tryTo-rndNum) < Math.abs(prefnum-rndNum))
            {
                System.out.println("Горячо!");
            }
            else if (Math.abs(tryTo-rndNum) > Math.abs(prefnum-rndNum))
            {
                System.out.println("Холодно!");
            }
            prefnum = tryTo;
        }
            System.out.println("Количество попыток: " + tryes + " ");

    }
}