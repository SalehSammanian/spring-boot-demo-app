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
           Student mary =  new Student( "Mary", LocalDate.of(2000, Month.JANUARY, 5), "mary.hobkins@gmail.com");
           Student alex =  new Student( "Alex", LocalDate.of(2004, Month.JANUARY, 5), "alex112@gmail.com");

           repository.saveAll(
                   List.of(mary, alex)
           );
        };
    }

}