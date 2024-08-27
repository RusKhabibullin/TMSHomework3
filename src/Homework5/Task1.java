package Homework5;

import java.util.Arrays;
import java.util.Scanner;
/*
1.1 Создать двумерный массив, заполнить его случайными числами.
1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
1.3 Найти сумму всех получившихся элементов и вывести в консоль.
*/
public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.println("Please enter a number:");
                array[i][j] += in.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int result = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                result += array[i][j];
            }
        }
        System.out.println("Sum: " + result);
    }

}
