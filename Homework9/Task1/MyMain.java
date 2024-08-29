package Homework9.Task1;

public class MyMain {
    public static void main(String[] args) {
        Position[] positions = {
                new Director(),
                new Worker(),
                new Accountant()
        };

        for (Position position : positions) {
            position.printPosition();
        }
    }
}