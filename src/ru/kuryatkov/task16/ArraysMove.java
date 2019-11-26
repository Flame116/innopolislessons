package ru.kuryatkov.task16;

public class ArraysMove {

    public static void main(String[] args) {
        arrayMake();
        display(arrayMake());
        System.out.println();
        display(toLeft(arrayMake()));
    }

    public static int[][] arrayMake() {
        int i;
        int j;
        int[][] array = new int[4][10];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = j;
            }
        }
        return array;
    }

    public static void display (int[][] array) {
        for (int[] lines : array){
            for (int columns : lines){
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
    public static int[][] toLeft(int[][] array){
        int i;
        int j;
        for(i = 0; i < array.length; i++ ){
            for(j = 0; j < array[i].length -1; j++){
                array[i][j] = array[i][j+1];
            }
            array[i][j] = 0;
        } return array;
    }

}