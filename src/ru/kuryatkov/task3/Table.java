package ru.kuryatkov.task3;

public class Table {
    public static void main(String[] args) {
        int a, b;
        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++)
                System.out.printf("%4d", (a*b));
                //System.out.println(a+" * "+b+" = "+a*b); //Второй вариант вывода
            System.out.println();
        }
    }
}
