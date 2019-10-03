package ru.kuryatkov.task4;

public class App {

    public static void main(String[] args) {
        Parent parentClass = new Parent();
        parentClass.setAge(32);
        System.out.println(parentClass.getAge());
        Child1 child1Class = new Child1(9, 12345);
        System.out.println(child1Class.getAge());
        parentClass.name();
        child1Class.name();

    }
}
