package org.src.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.src.Doctor;
import org.src.Examiner;
import org.src.Nurse;
import org.src.Patient;

@Configuration
public class AppConfig {

    @Bean
    public Patient patient(@Qualifier("doc1") Examiner examiner) {
        Patient patient = new Patient();
        patient.setProblem("headache");
        patient.setExaminer(examiner); // now here this examiner is getting autowired because we have doctor bean here and it is already created so it is getting autowired
        return patient;
    }

    @Bean(name = {"doc1", "doc2", "doc3"})
    // here we are giving multiple names to one bean, and it will be created only once
    // and if we don't give any name then default name is method name which is doctor1 here, But now doctor1 will not work as we have specified other names.
    @Scope("singleton")
    //@Scope("prototype") // just by adding this Scope here we are able to create a new bean everytime.
    public Doctor doctor1() {
        return new Doctor();
    }

    @Bean
    @Primary
    // by writing primary here we told spring that this is the one to choose if it gets confused with multiple options.
    // But this @Primary will be overridden by @Qualifier("beanName")
    public Nurse nurse() {
        return new Nurse();
    }

}
