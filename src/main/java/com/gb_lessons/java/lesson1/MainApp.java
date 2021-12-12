package com.gb_lessons.java.lesson1;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("1.");
        System.out.println(limitAB(10, 10));
        System.out.println("2.");
        isPosOfNeg(-10);
        System.out.println("3.");
        System.out.println(isNegativeTrue(-10));
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
        System.out.println("11.");
        int[] array = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(array));
    }

    /*task_1*/
    /*Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    public static boolean limitAB(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    /* task_2 */
    /*Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
    считаем положительным числом.*/
    public static void isPosOfNeg(int a) {
        System.out.println((a >= 0) ? "Число является положительным" : "Число является отрицательным");
        /*if (a >= 0) {
            System.out.println("Число является положительным");
        }
        else {
            System.out.println("Число является отрицательным");
        }*/
    }

    /* task_3 */
    /*Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.*/
    public static boolean isNegativeTrue(int a) {
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
            /*//В конце будет лишний пробел. Нужно обработать эту ситуацию
            System.out.print(array[i] + " ");*/
            //Cтарший программист - властелин Джуна. Я обработал, но нужно ли это, если везде в других Tasks такой же лишний пробел?
            // Стоит ли тратить мощности?
            if (i < array.length - 1) {
                System.out.print(array[i] + " ");
            }
            else {
                System.out.print(array[i]);
            }
        }
        System.out.println("\nМассив через toString: " + Arrays.toString(array));
    }

    /* task_6 */
    /*Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 2 5 8 11 14 17 20 23*/
    public static void arrayPlusThree() {
        int[] arrThree = new int[8];
        for (int i = 0; i < arrThree.length; ++i) {
            arrThree[i] = 2 + i * 3;
            System.out.print(arrThree[i] + " ");
        }
        System.out.println("");
    }

    /* task_7 */
    /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2*/
    public static void arrayMultiplyOnTwo() {
        int[] arrOnTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrOnTwo.length; ++i) {
            if (arrOnTwo[i] < 6) {
                arrOnTwo[i] *= 2;
            }
            System.out.print(arrOnTwo[i]+" ");
        }
        System.out.println("");
    }

    /* task_8 */
/* Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами */
    public static void arrayDiagonal() {
        //Попробуй раздели
        //один цикл заполняет массив значениями, два других выводят его на экран
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
            System.out.print(array[i] + " ");
            if (array[i] < minElem) {
                minElem = array[i];
            } else {
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
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    /* task_11 */
    /* *Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    checkBalance([1, 1, 1, || 2, 1]) → true,
    граница показана символами ||, эти символы в массив не входят.*/

    public static boolean checkBalance(int[] array) {
        boolean Balance = false;
        for (int i = 1; i < array.length; ++i) {
            int oneArray[] = Arrays.copyOf(array, i);
            int twoArray[] = Arrays.copyOfRange(array, i, array.length);
            int sumOnOneArray = Arrays.stream(oneArray).sum();
            int sumOnTwoArray = Arrays.stream(twoArray).sum();
            if (sumOnOneArray == sumOnTwoArray) {
                Balance = true;
                break;
            }
        }
        return (Balance);
    }
    
    //не важные изменения
    //ОЧЕНЬ ВАЖНЫЙ ФИКС
}
