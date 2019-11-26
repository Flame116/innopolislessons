package ru.kuryatkov.task16;

import java.util.Arrays;

public class ReverseMassive {
    public static void main(String[] args) {
        String arr = Arrays.toString(arrayMake());
        System.out.println(arr);
        String revArr = Arrays.toString(reverseArray(arrayMake()));
        System.out.println(revArr);
    }

    public static int[] arrayMake() {
        int i;
        int[] array = new int[10];
        for (i = 0; i < array.length; i++) {
                array[i] = i;
            }return array;
        }

        public static int[] reverseArray (int[] array){
        int[] temp = new int[array.length];
        int i;
        int j = (array.length - 1);
        while (j >= 0)
        for(i = 0; i < array.length; i++){
            temp[j] = array[i];
            j--;
            }return temp;
        }


}