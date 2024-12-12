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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
           Student stefan = new Student(
                    LocalDate.of(2001, Month.JULY, 7),
                    "kostic@gmail.com",
                    "Stefan Kostic");

           Student mina = new Student(
                    LocalDate.of(2004, Month.JUNE, 19),
                    "mina@gmail.com",
                    "Mina Kostic");

           studentRepository.saveAll(
                   List.of(stefan, mina)
           );
        };
    }

}
