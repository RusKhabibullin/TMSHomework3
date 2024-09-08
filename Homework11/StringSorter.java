package Homework11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String[] strings = {str1, str2, str3};

        Arrays.sort(strings, Comparator.comparingInt(String::length));

        System.out.println("Строки в порядке возрастания длины:");
        for (String str : strings) {
            System.out.println(str + " (длина: " + str.length() + ")");
        }
    }
}