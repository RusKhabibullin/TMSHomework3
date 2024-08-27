package Homework7.Doctor;

public class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void treat() {
        System.out.println("No treatment set");
    }

    public String getInformation() {
        return "Doctor name: " + this.name;
    }
}