package Homework8;

public abstract class Animal {
    public static void main(String[] args) {
        // Создание объекта Dog с использованием фабрики
        Dog dog = Dog.DogFactory.createDog();
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");

        // Создание и тестирование других животных
        Animal tiger = new Tiger();
        ((Tiger) tiger).voice();
        ((Tiger) tiger).eat("Meat");

        Animal rabbit = new Rabbit();
        ((Rabbit) rabbit).voice();
        ((Rabbit) rabbit).eat("Grass");
    }

    public abstract void voice();

    public abstract void eat(String food);
}