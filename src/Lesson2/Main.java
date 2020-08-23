package Lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //1. Задать целочисленный массив,
        // состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
//
//        static public void arry () {
//            int[] arr = {1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1};
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == 0) {
//                    arr[i] = 1;
//                    System.out.print(" " + arr[i]);
//                } else if (arr[i] == 1) {
//                    arr[i] = i;
//                    arr[i] = 0;
//                    System.out.print(" " + arr[i]);
//                }
//            }
//        }


        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21

//        int[] arr = new int[8];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i * 3;
//            System.out.print(" " + arr[i]);
//        }

        //3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;

//        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 6) {
//                arr[i] = arr[i] * 2;
//                System.out.print(" " + arr[i]);
//            } else {
//                System.out.print(" " + arr[i]);
//            }
//
//        }
        //4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//        int number = 5;
//        int[][] arr = new int[number][number];
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number; j++) {
//                if ((i == j) || (i == number - 1 - j)) {
//                    arr[i][j] = 1;
//                }
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        //5. ** Задать одномерный массив и найти в нем минимальный
//        // и максимальный элементы (без помощи интернета);
//        int[] arr = {1,5,6,7,8,4,6,3,2};
//        int arrMin = arr[0];
//        int arrMax = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            arrMin = (arrMin < arr[i]) ? arrMin : arr[i];
//            arrMax = (arrMax > arr[i]) ? arrMax : arr[i];
//
//        }
//        System.out.println("Минимальный " + arrMin + " , Максимальный: " + arrMax);


        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место,
        // в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.

//        static boolean checkBalance(int[] arr){
//            int test1 = 0;
//            int test2 = 0;
//
//            for (int i = 0; i < arr.length + 1; i++) {
//                test1 = 0;
//                test2 = 0;
//
//                for (int j = 0; j < i; j++) {
//                    test1 += arr[j];
//                }
//
//                for (int j = i; j < arr.length; j++) {
//                    test2 += arr[j];
//                }
//
//                if (test1 == test2) return true;
//            }
//            return false;
//        }

        //7. **** Написать метод, которому на вход подается
        // одномерный массив и число n (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементымассива на n позиций.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами.

        //час потрачен, итога нет
    }
}

