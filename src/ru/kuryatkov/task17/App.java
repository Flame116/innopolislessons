package ru.kuryatkov.task17;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Nick", 15));
        personList.add(new Person("Billy",18));
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Tom",10));
        personList.add(new Person("Nick", 8));

        System.out.println("До сортировки: ");
        for (Person person : personList){
            System.out.println(person);
        }
        System.out.println();
        System.out.println("После сортировки: ");

        Collections.sort(personList, new PersonSuperComparator());
        for (Person person : personList){
            System.out.println(person);
            }
        System.out.println();

    }
}
