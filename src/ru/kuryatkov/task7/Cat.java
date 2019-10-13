package ru.kuryatkov.task7;

public class Cat extends Animal implements Run, Swim{
    @Override
    public void getName() {
        System.out.println("Это кошка");
    }

    @Override
    public void getSpeed() {
        getName();
        System.out.println("Разгоняемся");
    }

    @Override
    public void immersion() {
        getName();
        System.out.println("Боюсь воды))");
    }
}
