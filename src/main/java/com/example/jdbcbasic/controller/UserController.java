package com.example.jdbcbasic.controller;
import java.util.List;

import com.example.jdbcbasic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    // autowiring user repository
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String toTest() {
        return "Welcome to Java Inspires...";
    }

    /**
     * this method returns list of usernames
     *
     * @return username list
     */
    @GetMapping(path = "/getusernames")
    public List<String> getAllUserNames() {
        return userRepository.getAllUserNames();
    }
}