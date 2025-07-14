package com.example.footballjourney.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test")
    private String test() {
        return "Hello World !!! We are working on football journey";
    }
}
