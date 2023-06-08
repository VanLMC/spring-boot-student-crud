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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student1 = new Student(
                    "test",
                    "test@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student student2 = new Student(
                    "test2",
                    "test2@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 5)
            );

            repository.saveAll(List.of(student1, student2));
        };
    }
}
