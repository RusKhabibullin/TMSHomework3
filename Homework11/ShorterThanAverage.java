package Homework11;

import java.util.Scanner;

public class ShorterThanAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String[] strings = {str1, str2, str3};
        int totalLength = 0;

        for (String str : strings) {
            totalLength += str.length();
        }

        double averageLength = totalLength / (double) strings.length;

        System.out.println("Строки длиной меньше средней (" + averageLength + "):");
        for (String str : strings) {
            if (str.length() < averageLength) {
                System.out.println(str + " (длина: " + str.length() + ")");
            }
        }
    }
}