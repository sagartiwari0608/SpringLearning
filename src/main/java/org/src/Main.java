package org.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctorObj = (Doctor) context.getBean("Doctorbro");
//        Doctor doctorObj = new Doctor();     // java was of creating objects.
        doctorObj.cure();
        System.out.println(doctorObj.getQualification());

    }
}