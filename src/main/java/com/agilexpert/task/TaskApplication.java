package com.agilexpert.task;

import com.agilexpert.task.model.App;
import com.agilexpert.task.model.User;
import com.agilexpert.task.repository.AppRepository;
import com.agilexpert.task.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class TaskApplication {

    @Autowired
    AppRepository appRepository;

    @Autowired
    UserRepository userRepository;


    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {
            User alex = User.builder()
                    .name("Alex")
                    .build();
            userRepository.save(alex);

            App facebook = App.builder()
                    .name("Facebook")
                    .build();
            appRepository.save(facebook);


        };
    }

}
