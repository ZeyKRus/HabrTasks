package ru.homework.zeykrus.maxminav;

/*
Задача:
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] mainArray;

        try(Scanner scanner = new Scanner(System.in)) {
            while(true) {
                boolean isDigital = true;
                System.out.print("Введите размер массива: ");
                String strArrayLength = scanner.nextLine();
                char[] charArrayLength = strArrayLength.toCharArray();
                for(char c : charArrayLength) {
                    if(!Character.isDigit(c)) {
                        System.out.println("Введено некорректное значение для длинны массива.");
                        isDigital = false;
                        break;
                    }
                }
                if(isDigital) {
                    if(Integer.parseInt(strArrayLength)>0) {
                        mainArray = new int[Integer.parseInt(strArrayLength)];
                        break;
                    } else {
                        System.out.println("Длинна массива должна быть больше нуля.");
                    }
                }
            }
        }

        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i]=(int)(Math.random()*100);
        }

        int tempMax=mainArray[0];
        int tempMin=mainArray[0];
        double average=0.0;
        for (int i : mainArray) {
            average = average + i;
            if (tempMax < i) {
                tempMax = i;
            }
            if (tempMin > i) {
                tempMin = i;
            }
        }
        average=average/mainArray.length;

        System.out.printf("""
                        Размерность массива: %d
                        Наибольшее значение в массиве: %d
                        Наименьшее значение в массиве: %d
                        Среднее значение в массиве: %.1f""",
                mainArray.length,tempMax,tempMin,average);

    }
}
