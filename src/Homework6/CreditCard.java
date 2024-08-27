package Homework6;

/*
Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте метод, который позволяет начислять
сумму на кредитную карточку. Добавьте метод, который позволяет снимать с карточки некоторую сумму. Добавьте метод,
который выводит текущую информацию о карточке. Напишите программу, которая создает три объекта класса CreditCard, у
которых заданы номер счета и начальная сумма. Тестовый сценарий для проверки: Положите деньги на первые две карточки
и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */

import java.util.Scanner;

public class CreditCard {
    private String accountNumber;
    private double balance;

    // Конструктор для инициализации карточки
    public CreditCard(String accountNumber, double initialAmount) {
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    // Метод для пополнения счета через консольный ввод
    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму для пополнения на карточке " + accountNumber + ": ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Счет пополнен на сумму: " + amount);
        } else {
            System.out.println("Сумма для пополнения должна быть положительной.");
        }
    }

    // Метод для снятия суммы со счета через консольный ввод
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму для снятия с карточки " + accountNumber + ": ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Со счета снято: " + amount);
            } else {
                System.out.println("Недостаточно средств на счете.");
            }
        } else {
            System.out.println("Сумма для снятия должна быть положительной.");
        }
    }

    // Метод для вывода информации о карточке
    public String displayInfo() {
        return "Номер счета: " + accountNumber + ", Текущий баланс: " + String.format("%.2f", balance);
    }

}
