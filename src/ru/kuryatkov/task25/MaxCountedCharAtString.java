package ru.kuryatkov.task25;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxCountedCharAtString {
    public static void main(String[] args) {

        String str = "This is test message!";
        System.out.println(stringToMap(str));
        System.out.println("\n");
        maxCont(stringToMap(str));

    }

    public static Map stringToMap(String str){
        Map<Character, Integer> table = new HashMap<Character, Integer>();
        char[] c = str.toCharArray();
        for (Character ch : c){
            if (table.containsKey(ch)){
                table.put(ch, table.get(ch)+1);
            } else {
                table.put(ch, 1);
            }
        } return table;
    }

    public static void maxCont(Map<Character,Integer> table){
        int maxCount = Collections.max(table.values());
        for (Map.Entry<Character, Integer> entry : table.entrySet())
            if (entry.getValue() == maxCount){
                System.out.printf("Буква: ' %s ' в строке использовалась %d раз.", entry.getKey(), entry.getValue());
            }
    }

}
