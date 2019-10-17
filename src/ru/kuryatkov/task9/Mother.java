package ru.kuryatkov.task9;
import java.util.Scanner;

public class Mother {

    public static void main(String[] args) {

        System.out.println("Чем будем кормить ребёнка? ");
        Food[] list = Food.values();
        for (Food f : list) {
            System.out.println(f.getTitle());
        }
        Chield chield = new Chield();
        Scanner in = new Scanner(System.in);
        try {
            String food = in.nextLine();
            chield.eat(food);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //System.out.println("Введено неверное значение еды" + ex);
        } finally {
           System.out.println("Спасибо, мама");
        }


        }
    }
