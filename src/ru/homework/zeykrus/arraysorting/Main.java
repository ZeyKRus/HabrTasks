package ru.homework.zeykrus.arraysorting;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*100);
        }
        sort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }

    private static void sort(int[] array) {
        if(array!=null) {
            for (int i = array.length; i > 0; i--) {
                for (int j = 1; j < i; j++) {
                    int temp = array[j];
                    if(array[j-1]>array[j]) {
                        array[j]=array[j-1];
                        array[j-1]=temp;
                    }
                }
            }
        }
    }
}