package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student hso = new Student(
                    "Hüseyin",
                    "ozkan.huseyin@gmail.com",
                    LocalDate.of(2001, APRIL,23)
            );

            Student mustafa = new Student(
                    "Mustafa",
                    "ozkan.mustafa@gmail.com",
                    LocalDate.of(1995, APRIL,20)
            );
            repository.saveAll(
                    List.of(hso, mustafa)
            );
        };
    }
}
