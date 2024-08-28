package Homework8;

class Dog extends Animal {
    // Приватный конструктор
    private Dog() {
        // Приватный конструктор запрещает создание объектов вне этого класса
    }

    @Override
    public void voice() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equalsIgnoreCase(food)) {
            System.out.println("Dog loves to eat meat");
        } else {
            System.out.println("Dog does not eat " + food);
        }
    }

    // Вложенный класс для создания объекта Dog
    static class DogFactory {
        static Dog createDog() {
            return new Dog();
        }
    }
}
