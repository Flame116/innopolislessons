package ru.kuryatkov.task23;

import java.util.HashMap;
import java.util.Map;

public class FirstNonDuplicateLetterInWord {
    public static void main(String[] args) {
        String str = "book";
        System.out.println(letter(str));

    }
    public static Character letter (String str){
        Map <Character, Integer> stats = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (!stats.containsKey(c)){
                stats.put(c, 1);
            } else {
               stats.put(c, stats.get(c) + 1);
            }
        } for (int j = 0; j < str.length(); j++){
            char c = str.charAt(j);
            if (stats.get(c) == 1)
                return c;
        } return null;
    }
}
