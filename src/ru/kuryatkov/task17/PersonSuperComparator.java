package ru.kuryatkov.task17;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        int resultCompareByName = a.getName().compareTo(b.getName());
            if (resultCompareByName != 0){
               return a.getAge() - b.getAge();
            }
            return resultCompareByName;
    }

}
