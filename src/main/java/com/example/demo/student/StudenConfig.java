package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudenConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student kwesi = new Student(
                    "Oteng Kwesi",
                    "james@gmail.com",
                    LocalDate.of(1990, Month.JANUARY, 29)
            );

            Student kwaku = new Student(
                    "Afutu Kwaku",
                    "darneltaphil@gmail.com",
                    LocalDate.of(1994, Month.JANUARY, 29)
            );

            Student kofi = new Student(
                    "Kofano Akpadji",
                    "arnoldkofia@gmail.com",
                    LocalDate.of(1991, Month.JANUARY, 29)
            );

            repository.saveAll(
                    List.of(kwesi, kwaku, kofi)
            );
        };
    }
}
