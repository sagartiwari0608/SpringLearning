package org.src;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("singleton")
public class Doctor implements Examiner {
    private String qualification;

    public Doctor() {
        System.out.println("doctor constructor called");
    }

    // Doctor(String qualification) {
    // System.out.println("doctor constructor");
    // this.qualification = qualification;
    // }

    @Override
    public void assist() {
        System.out.println("doctor is assisting here");
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


}
