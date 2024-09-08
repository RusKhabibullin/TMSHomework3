package Homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InformationExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();

        // Регулярные выражения для поиска информации
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String docNumberRegex = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        String phoneNumberRegex = "\\+\\(\\d{2}\\)\\d{7,8}";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern docNumberPattern = Pattern.compile(docNumberRegex);
        Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex);

        Matcher emailMatcher = emailPattern.matcher(input);
        Matcher docNumberMatcher = docNumberPattern.matcher(input);
        Matcher phoneNumberMatcher = phoneNumberPattern.matcher(input);

        // Вывод найденной информации
        if (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        } else {
            System.out.println("email: Не найден");
        }

        if (docNumberMatcher.find()) {
            System.out.println("document number: " + docNumberMatcher.group());
        } else {
            System.out.println("document number: Не найден");
        }

        if (phoneNumberMatcher.find()) {
            System.out.println("phone number: " + phoneNumberMatcher.group());
        } else {
            System.out.println("phone number: Не найден");
        }
    }
}