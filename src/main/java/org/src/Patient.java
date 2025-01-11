package org.src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Patient {

    private String problem;
    private Examiner examiner;

    public Patient() {
        System.out.println("i am patient and I need assistance.");
    }

    //this one here will be our constructor injection and this is it.
    @Autowired
    public Patient(Examiner examiner) {
        this.examiner = examiner;
    }

    public String getProblem() {
        return problem;
    }

    @Value("headache")
    public void setProblem(String problem) {
        this.problem = problem;
    }

    //this here will be setter injection because we are using  a setter to inject a value.
    //    @Autowired
    // This autowired can be written just above the declaration of examiner but since it's going to be injected here so this makes more sense
//    @Qualifier("nurse")  // here in qualifier we need to mention the name of the java class in small letters
    public void setExaminer(Examiner examiner) {
        this.examiner = examiner;
    }

    public Examiner getExaminer() {
        return examiner;
    }
}
