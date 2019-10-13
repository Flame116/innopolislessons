package ru.kuryatkov.task6;

public class Counter {
    public static void main(String[] args) {
       Auto auto = new Auto();
       auto.infoCounter();
       Auto auto1 = new Auto();
       auto1.infoCounter();
        Auto auto2 = new Auto();
        auto2.infoCounter();

    }
    public static class Auto{
         int counter = 1;
        Auto(){
            counter ++;
        }
        public  void infoCounter(){
            System.out.println("Номер объекта: " + counter);
        }
    }

}
