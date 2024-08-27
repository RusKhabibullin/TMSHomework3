package Homework7.Doctor;


public class Dentist extends Doctor {
    public Dentist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println("Dental treatment");
    }
}
