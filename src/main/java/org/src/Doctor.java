package org.src;

public class Doctor {
    String qualification;

    Doctor(String qualification){
        System.out.println("doctor constructor");
        this.qualification = qualification;
    }
    public void cure(){
        System.out.println("Doctor is curing the patient");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
