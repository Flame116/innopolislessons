package ru.kuryatkov.task7;

public class Frog extends Animal implements Swim{
    @Override
    public void getName() {
        System.out.println("Это лягушка");
    }

    @Override
    public void immersion() {
        getName();
        System.out.println("Плывём");

    }
}
