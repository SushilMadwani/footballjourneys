package com.example.footballjourney.controller;

import com.example.footballjourney.entity.User;
import com.example.footballjourney.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final UserService userService;

    @GetMapping("test")
    private String test() {
        return "Hello World !!! We are working on football journey";
    }

    @GetMapping("users")
    private List<User> getUsers() {
        return userService.getUsers();
    }
}
