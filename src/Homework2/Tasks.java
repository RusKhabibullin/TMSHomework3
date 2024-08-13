package Homework2;


import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите задачу - ");

        int task = sc.nextInt();
        switch (task) {
            case 1:
                evenOrNotEven();
                break;
            case 2:
                calcTemperature();
                break;
            case 3:
                square();
                break;
            case 4:
                order();
                break;
            case 5:
                positive();
                break;
            default:
                System.out.print("Задача не найдена");
        }
    }

    private static void evenOrNotEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }

    private static void calcTemperature() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int temperature = sc.nextInt();
        if (temperature > -5) {
            System.out.println("Warm");
        } else if (temperature > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    private static void square() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 10 до 20: ");
        int x = sc.nextInt();
        if (x >= 10 & x <= 20) {
            System.out.println(x * x);
        } else {
            System.out.println("Неверное число");
        }
    }

    private static void order() {
        int x = 7;
        while (x <= 98) {
            System.out.print(x + " ");
            x += 7;
        }
    }

    private static void positive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = sc.nextInt();
        if (x <= 0) {
            System.out.print("Неверное число");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.print("Ответ:" + sum);
    }
}