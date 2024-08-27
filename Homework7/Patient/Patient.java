package Homework7.Patient;

import Homework7.Doctor.Doctor;

    public class Patient {
        private String name;
        private int treatmentPlan;
        private Doctor doctor;

        public Patient(String name, int treatmentPlan) {
            this.name = name;
            this.treatmentPlan = treatmentPlan;
        }

        public Doctor getDoctor() {
            return doctor;
        }

        public void setDoctor(Doctor doctor) {
            this.doctor = doctor;
        }

        public int getTreatmentPlan() {
            return treatmentPlan;
        }
    }

