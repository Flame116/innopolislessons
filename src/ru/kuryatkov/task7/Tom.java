package ru.kuryatkov.task7;

public class Tom extends Human{
    @Override
    public void getName() {
        System.out.println("My name is Tom");
    }

    @Override
    public void getSpeed() {
        System.out.println("I'm running very fast!");

    }

    @Override
    public void immersion() {
        System.out.println("I can't swim =((");

    }
}
