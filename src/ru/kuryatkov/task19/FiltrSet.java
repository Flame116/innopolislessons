package ru.kuryatkov.task19;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FiltrSet {
    public static void main(String[] args) {

        Set<String> words = new TreeSet<>();
        words.add("buzze");
        words.add("food");
        words.add("tree");
        words.add("football");
        words.add("!");
        words.add("hot");
        for(String word : words) {
            System.out.println(word);
        }
        System.out.println();
        removeEvenLength(words);
        for(String word : words) {
            System.out.println(word);
        }

    }

    public static Set<String> removeEvenLength(Set<String> words){
        Iterator<String> iter = words.iterator();
        int letter;
        while(iter.hasNext()){
          letter = iter.next().length();
            if (letter % 2 == 0){
                iter.remove();
            }
        }
        return words;
    }
}
