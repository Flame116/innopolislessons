package ru.kuryatkov.task7;

public class Eagle extends Animal implements Run, Fly{
    @Override
    public void getName() {
        System.out.println("Это орёл");
    }

    @Override
    public void toHeight() {
        getName();
        System.out.println("Полетели");
    }

    @Override
    public void getSpeed() {
        getName();
        System.out.println("Побежал");

    }
}
