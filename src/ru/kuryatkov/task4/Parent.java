package ru.kuryatkov.task4;

public class Parent {

    private int age;

    public Parent() {
    }

    public Parent(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void name() {
        System.out.println("Я родитель");
    }

}
