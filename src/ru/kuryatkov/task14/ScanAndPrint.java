package ru.kuryatkov.task14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScanAndPrint {
    public static void main(String[] args) throws IOException{
        try (Scanner sc = new Scanner(new File("products.txt"))){
            System.out.println("Наименование           Кол-во   Цена  Стоимость");
            System.out.println("================================================");
            double amount = 0;
            while (sc.hasNextLine()){
                String name = sc.nextLine();
                double quantity = Double.parseDouble(sc.nextLine());
                double cost = Double.parseDouble(sc.nextLine());
                amount +=  quantity * cost;
                System.out.printf("%-20s  %.3f x %.2f = %.2f\n", name, quantity, cost, quantity*cost);
            }
            System.out.println("==================================================");
            System.out.printf("Итого: %38.2f",amount);
        }

    }
}
