package ru.kuryatkov.task17;

public class Person {

    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + "name = " + name + ", age = " + age +  '}';
    }
}
