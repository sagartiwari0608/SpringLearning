package org.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.src.config.AppConfig;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Doctor docObj1 = context.getBean("doc1", Doctor.class);
//        Doctor docObj2 = context.getBean("doc2", Doctor.class);
//        Doctor docObj3 = context.getBean("doc3", Doctor.class);
//        Doctor doctor1Obj = context.getBean("doctor1", Doctor.class); // this name doctor1 will not work because we have specified names hence only those names will be considered.
//        docObj1.assist();
//        docObj2.assist();
//        docObj3.assist();
//        doctor1Obj.assist(); // this wont work because same reason name is provided hence default name isn't considered
        Patient patient = context.getBean("patient", Patient.class);
        patient.getExaminer().assist();


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
////        following is a way to GetBean with name and then we need to typecast it to a specific object that we want.
//        Patient patientObj = (Patient) context.getBean("Patient");
////        Doctor doctorObj = new Doctor();     // java was of creating objects.
//        patientObj.getExaminer().assist();
////        following is the way to get bean class based and name can also be mentioned in case of conflicts of beans.
//        Doctor doctorObj2 = context.getBean("Doctor", Doctor.class);
//        doctorObj2.assist();
    }
}
