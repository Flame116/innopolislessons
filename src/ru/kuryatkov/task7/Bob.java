package ru.kuryatkov.task7;

public class Bob extends Human {
    @Override
    public void getName() {
        System.out.println("My name is Bob");

    }

    @Override
    public void getSpeed() {
        System.out.println("I'm running faster than Tom");

    }

    @Override
    public void immersion() {
        System.out.println("And I can to swim!!!");

    }
}
