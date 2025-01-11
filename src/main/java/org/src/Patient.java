package org.src;

public class Patient {

    private String problem;
    private Examiner examiner;

    public Patient() {
        System.out.println("i am patient and I need assistance.");
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public void setExaminer(Examiner examiner) {
        this.examiner = examiner;
    }

    public Examiner getExaminer() {
        return examiner;
    }
}
