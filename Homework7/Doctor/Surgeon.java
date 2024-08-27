package Homework7.Doctor;

public class Surgeon extends Doctor{
    public Surgeon(String name) {
        super(name);
    }
    @Override
    public void treat() {
        System.out.println("Surgical treatment");
    }

}