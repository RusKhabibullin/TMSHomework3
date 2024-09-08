package Homework11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String[] words = {str1, str2, str3};

        for (String word : words) {
            if (hasUniqueCharacters(word)) {
                System.out.println("Первое слово с уникальными символами: " + word);
                return;
            }
        }

        System.out.println("Не найдено слов с уникальными символами.");
    }

    private static boolean hasUniqueCharacters(String word) {
        Set<Character> charSet = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}