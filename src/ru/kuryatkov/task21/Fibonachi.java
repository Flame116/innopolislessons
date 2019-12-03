package ru.kuryatkov.task21;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(recursiveFibonachi(10));
        Fibo(10);

    }
    static int recursiveFibonachi(int x) {
        if (x == 0){
            return 0;
        }
        if (x == 1){
            return 1;
        }
        else return recursiveFibonachi(x-1) + recursiveFibonachi(x-2);
    }

    static int[] Fibo (int n){
        int[] Fibo = new int[n+1];
        Fibo[0] = 0;
        Fibo[1] = 1;
        for (int i = 2; i <= n; i++){
            Fibo[i] = Fibo[i -1] + Fibo[i - 2];
            System.out.println(Fibo[i]);
        } return Fibo;
    }
}
