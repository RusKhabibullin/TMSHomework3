package Homework9.Task2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Triangle(3, 4, 5),
                new Rectangle(4, 6),
                new Circle(5),
                new Triangle(6, 8, 10),
                new Rectangle(7, 8)
        };

        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}