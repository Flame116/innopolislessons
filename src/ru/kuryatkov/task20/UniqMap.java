package ru.kuryatkov.task20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqMap {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("Vasiliy", "Ivanov");
        person.put("Ivan", "Petrov");
        person.put("Nikolay", "Zyranov");
        person.put("Nikita", "Serov");
        person.put("Petr", "Ivanov");
        person.put("Saveliy", "Kramorov");
        System.out.println(isUnique(person));

    }

    public static boolean isUnique(Map<String, String> person) {
        Set<String> uniqueValues = new HashSet<>(person.values());
        if (person.isEmpty()) {
            return true;
        } else {
            if (uniqueValues.size() == person.values().size()){
                return true;
            }
        } return false;
    }
}