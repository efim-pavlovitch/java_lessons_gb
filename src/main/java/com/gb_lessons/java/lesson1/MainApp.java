package com.gb_lessons.java.lesson1;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("1.");
        System.out.println(limitAB(10, 10));
        System.out.println("2.");
        methPosNeg(-10);
        System.out.println("3.");
        System.out.println(negativeTrue(-10));
        System.out.println("4.");
        nameToOut("Иван");
        System.out.println("5.");
        arrayZeroOne();
        System.out.println("6.");
        arrayPlusThree();
        System.out.println("7.");
        arrayMultiplyOnTwo();
        System.out.println("8.");
        arrayDiagonal();
        System.out.println("9.");
        arrayMinMax();
        System.out.println("10.");
        leapYear(2021);

    }

    /*task_1*/
    /*Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    public static boolean limitAB(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    /* task_2 */
    /*Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
    считаем положительным числом.*/
    public static void methPosNeg(int a) {
        if (a >= 0) System.out.println("Число является положительным");
        else if (a < 0) System.out.println("Число является отрицательным");
    }
    
    //Тест

    /* task_3 */
    /*Написать метод, которому в качестве параметра передается целое число. Метод должен
    вернуть true, если число отрицательное.*/
    public static boolean negativeTrue(int a) {
        return (a < 0);
    }

    /* task_4 */
    /*Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/
    public static void nameToOut(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /* task_5 */
    /*Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void arrayZeroOne() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; ++i) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i]+" ");
        }
        System.out.println("\nМассив через toString: " + Arrays.toString(array));
    }

    /* task_6 */
    /*Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 2 5 8 11 14 17 20 23*/
    public static void arrayPlusThree() {
        int[] arrThree = new int[8];
        for (int i = 0, a = 2; i < arrThree.length; ++i, a = a + 3) {
            arrThree[i] = a;
            System.out.print(arrThree[i]+" ");
        }
        System.out.println("");
    }

    /* task_7 */
    /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2*/
    public static void arrayMultiplyOnTwo() {
        int[] arrOnTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        /*//так не работает(((
        for (int elem : arrOnTwo) {
            if (elem < 6) elem = elem * 2;
        }*/
        //магия, которая работает... но есть ли смысл?
        int i = 0;
        for (int elem : arrOnTwo) {
            if (elem < 6) {
                arrOnTwo[i] *= 2;
            }
            System.out.print(arrOnTwo[i]+" ");
            ++i;
        }
        //так работает
        /*for (int i=0; i<arrOnTwo.length; ++i){
            if (arrOnTwo[i]<6) arrOnTwo[i] *= 2;
        }*/
        System.out.println("");
    }

    /* task_8 */
/* Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами */
    public static void arrayDiagonal() {
        int[][] squareArray = new int[6][6];
        int ValueOfArray = 1;
        for (int i = 0; i < squareArray.length; ++i) {
            for (int j = 0; j < squareArray[i].length; ++j) {
                squareArray[i][i] = ValueOfArray;
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }


    /* task_9 */
    /* *Задать одномерный массив и найти в нем минимальный и максимальный элементы*/
    public static void arrayMinMax() {
        int[] array = {1, 19, 15, -7, 30, 47, 1, 46, -6, 10};
        int minElem = array[0], maxElem = array[0];
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i]+" ");
            if (array[i]<minElem) {
            minElem = array[i];
            }
            if (array[i]>maxElem) {
            maxElem = array[i];
            }
        }
        System.out.println("\nМинимальный элемент массива: " + minElem);
        System.out.println("Максимальный элемент массива: " + maxElem);
    }

    /* task_10 */
    /* *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static void leapYear(int year) {
        if (((year % 4 == 0) & !(year % 100 == 0)) | (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }
    
    //Сегодня я добавил новую фишку
    //Далее код {...}

}
