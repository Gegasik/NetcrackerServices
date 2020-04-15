package com.netcracker;

import com.netcracker.entity.Category;
import com.netcracker.entity.Film;
import com.netcracker.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.netcracker.repositories.FilmRepository;

@SpringBootApplication
public class NetcrackerApplication {
    @Autowired
    FilmRepository filmRepository;
    @Autowired
    CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(NetcrackerApplication.class, args);
    }

    @Bean
    public CommandLineRunner springdata() {
        return (args) -> {

        };


    }

    ;
}


