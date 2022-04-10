package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student wanillo = new Student(
                    "Wanillo",
                    "wanillo.kokunero@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student Kike = new Student(
                    "Kike",
                    "kike.montilla@gmail.com",
                    LocalDate.of(2003, Month.JULY, 5)
            );

            repository.saveAll(List.of(wanillo, Kike));
        };
    }
}
