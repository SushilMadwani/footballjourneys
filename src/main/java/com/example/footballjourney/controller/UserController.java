package com.example.footballjourney.controller;

import com.example.footballjourney.entity.UserQuestion;
import com.example.footballjourney.service.UserQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/footjourney")
public class UserController {
    private final UserQuestionService userQuestionService;
    @GetMapping(path = "/user/questions")
    public List<UserQuestion> getUserQuestions() {
        return userQuestionService.getUserQuestions();
    }

}
