package Homework8;

class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Tiger roars");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equalsIgnoreCase(food)) {
            System.out.println("Tiger loves to eat meat");
        } else {
            System.out.println("Tiger does not eat " + food);
        }
    }
}