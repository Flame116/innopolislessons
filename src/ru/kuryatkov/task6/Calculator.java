package ru.kuryatkov.task6;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double doub1;
        double doub2;
        char oper;
        double res;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        doub1 = in.nextDouble();
        System.out.println("Введите второе число");
        doub2 = in.nextDouble();
        System.out.println("Введите необходимую операцию: \n +\n -\n /\n *\n ");
        oper = in.next().charAt(0);
        res = calc(doub1,doub2, oper);
        System.out.println("Результат: " +res);
    }
    public static double calc(double doub1, double doub2, char oper) {
        double res = 0;
        switch (oper) {
            case '+':
                res = doub1 + doub2;
                break;
            case '-':
                res = doub1 - doub2;
                break;
            case '/':
                res = doub1/doub2;
                break;
            case  '*':
                res = doub1 * doub2;
                break;
            default:
                System.out.println("Введена неправильная операция!");
        }
        return res;

    }

}
