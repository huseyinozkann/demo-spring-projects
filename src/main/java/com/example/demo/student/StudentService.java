package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Hüseyin",
                        "ozkan.huseyin@gmail.com",
                        LocalDate.of(2001, Month.APRIL,23),
                        21
                )
        );
    }
}
