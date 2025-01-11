package org.src;

public class Nurse implements Examiner {
    public Nurse() {
        System.out.println("nurse constructor");
    }

    @Override
    public void assist() {
        System.out.println("Nurse is assisting here");
    }
}
