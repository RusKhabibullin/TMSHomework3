package Homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbbreviationFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        // Регулярное выражение для поиска аббревиатур
        String regex = "\\b[A-Z]{2,6}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Аббревиатуры:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}