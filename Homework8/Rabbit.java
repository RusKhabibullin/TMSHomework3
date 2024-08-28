package Homework8;

class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Rabbit squeaks");
    }

    @Override
    public void eat(String food) {
        if ("Grass".equalsIgnoreCase(food)) {
            System.out.println("Rabbit loves to eat grass");
        } else {
            System.out.println("Rabbit does not eat " + food);
        }
    }
}