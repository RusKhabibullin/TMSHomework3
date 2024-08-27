package Homework6;

public class Engine {
    public static void main(String[] args) {
        // Создаем три объекта CreditCard
        CreditCard card1 = new CreditCard("1234-5678-9012", 1000.0);
        CreditCard card2 = new CreditCard("2345-6789-0123", 1500.0);
        CreditCard card3 = new CreditCard("3456-7890-1234", 2000.0);

        // Пополняем первые две карточки
        System.out.println("Пополнение карточки 1:");
        card1.deposit();
        System.out.println("Пополнение карточки 2:");
        card2.deposit();

        // Снимаем деньги с третьей карточки
        System.out.println("Снятие с карточки 3:");
        card3.withdraw();

        // Выводим информацию о всех трех карточках
        System.out.println(card1.displayInfo());
        System.out.println(card2.displayInfo());
        System.out.println(card3.displayInfo());
    }
}



