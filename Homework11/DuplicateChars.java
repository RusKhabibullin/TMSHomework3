package Homework11;

import java.util.Scanner;

public class DuplicateChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            result.append(c).append(c);
        }

        System.out.println("Результат: " + result.toString());
    }
}