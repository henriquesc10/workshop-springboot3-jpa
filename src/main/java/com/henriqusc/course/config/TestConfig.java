package com.henriqusc.course.config;

import com.henriqusc.course.entities.User;
import com.henriqusc.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria", "maria@gmail.com", "988887777", "123456");
        User user2 = new User(null, "Joao", "joao@gmail.com", "966665555", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
