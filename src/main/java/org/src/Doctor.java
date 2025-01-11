package org.src;

public class Doctor {
    private String qualification;
    private Nurse assistor;


    Doctor(String qualification) {
        System.out.println("doctor constructor");
        this.qualification = qualification;
    }

    public void cure() {
        System.out.println("Doctor is curing the patient");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Nurse getAssistor() {
        return assistor;
    }

    public void setAssistor(Nurse assistor) {
        this.assistor = assistor;
    }

}
