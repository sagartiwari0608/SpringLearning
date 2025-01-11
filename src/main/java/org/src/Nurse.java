package org.src;

import org.springframework.stereotype.Component;

@Component("nurse") // by default also the name will be this, but I have mentioned here, so I will remember both ways
public class Nurse implements Examiner {
    public Nurse() {
        System.out.println("nurse constructor");
    }

    @Override
    public void assist() {
        System.out.println("Nurse is assisting here");
    }
}
