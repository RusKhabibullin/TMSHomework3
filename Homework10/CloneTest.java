package Homework10;

import Homework10.User.User;

public class CloneTest {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CloneTest <cloneType> <userId>");
            return;
        }

        String cloneType = args[0];
        int userId = Integer.parseInt(args[1]);

        // Создаем исходный объект User
        User originalUser = new User(userId, "John Doe", "john.doe@example.com");

        try {
            User clonedUser;
            if (cloneType.equalsIgnoreCase("shallow")) {
                clonedUser = originalUser.clone();
            } else if (cloneType.equalsIgnoreCase("deep")) {
                clonedUser = originalUser.deepClone();
            } else {
                System.out.println("Unknown clone type: " + cloneType);
                return;
            }

            System.out.println("Original User: " + originalUser);
            System.out.println("Cloned User: " + clonedUser);

            // Сравнение
            System.out.println("Are original and cloned users equal? " + originalUser.equals(clonedUser));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}