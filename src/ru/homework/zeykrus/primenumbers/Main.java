package ru.homework.zeykrus.primenumbers;

/*
1.2. Поиск простых чисел
Задача:
Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */

public class Main {
    public static void main(String[] args) {
        int min = 2;
        int max = 100;
        int[] primeNum = primeNumbers(min,max);
        if (primeNum!=null) {
            System.out.printf("Простые числа в диапазоне от %d до %d:",min,max);
            for (int i : primeNum) {
                System.out.print(i+" ");
            }
        }
    }

    private static int[] primeNumbers(int min, int max){
        if ((min<=max)&(min>=0)&(max>=0)) {
            int[] temp = new int[max-min+1];
            int amount=0;
            for (int i = min; i <= max; i++) {
                if(i<2) {
                    continue;
                }
                boolean prime = true;
                for (int j = 2; j < i; j++) {
                    if(i%j==0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    temp[amount] = i;
                    amount++;
                }
            }
            int[] result = new int[amount];
            System.arraycopy(temp, 0, result, 0, amount);
            return result;
        }
        return null;
    }
}
