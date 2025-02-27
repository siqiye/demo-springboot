package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yulin = new Student(
                    "Yunlin",
                    "abc@gmail.com",
                    LocalDate.of(2000, 1, 10)
            );

            Student siqi = new Student(
                    "Siqi",
                    "dfg@gmail.com",
                    LocalDate.of(2018, 2, 6)
            );
            repository.saveAll(
                    List.of(yulin, siqi)
            );
        };
    }
}
