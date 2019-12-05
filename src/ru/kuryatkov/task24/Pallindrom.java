package ru.kuryatkov.task24;

public class Pallindrom {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println(isPallindrom(word));
        System.out.println(isPallindrome1(word));

    }

    public static boolean isPallindrom(String word){
        String wordToLowerCase = word.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(wordToLowerCase);
        String reverse = stringBuilder.reverse().toString();
        if (reverse.equals(wordToLowerCase)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPallindrome1 (String word){
        String wordToLowerCase = word.toLowerCase();
        for (int i = 0, j = wordToLowerCase.length()-1; i < j; i++, j--){
            if (wordToLowerCase.charAt(i) != wordToLowerCase.charAt(j)) {
                return false;
            }
        } return true;
    }

}
