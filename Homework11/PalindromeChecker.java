package Homework11;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        System.out.println("Введите номер слова для проверки:");
        int wordIndex = scanner.nextInt();

        String[] words = input.split("\\s+");

        if (wordIndex > 0 && wordIndex <= words.length) {
            String word = words[wordIndex - 1];
            if (isPalindrome(word)) {
                System.out.println("Слово \"" + word + "\" является палиндромом.");
            } else {
                System.out.println("Слово \"" + word + "\" не является палиндромом.");
            }
        } else {
            System.out.println("Ошибка: введен неверный номер слова.");
        }
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}