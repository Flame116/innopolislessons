package ru.kuryatkov.task8;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Censored {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String input = in.next();
        Pattern pattern = Pattern.compile("(?!u)бяка");
        Matcher matcher = pattern.matcher(input);
        String s = matcher.replaceAll("вырезано цензурой");
        System.out.println(s);
    }
}
