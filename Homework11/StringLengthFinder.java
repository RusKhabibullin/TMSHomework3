package Homework11;

import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String[] strings = {str1, str2, str3};
        String shortest = str1;
        String longest = str1;

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        System.out.println("Самая короткая строка: " + shortest + " (длина: " + shortest.length() + ")");
        System.out.println("Самая длинная строка: " + longest + " (длина: " + longest.length() + ")");
    }
}