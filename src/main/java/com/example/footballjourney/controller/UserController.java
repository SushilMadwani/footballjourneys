package com.example.footballjourney.controller;

import com.example.footballjourney.entity.UserQuestion;
import com.example.footballjourney.model.NewUser;
import com.example.footballjourney.model.UserDTO;
import com.example.footballjourney.service.UserQuestionService;
import com.example.footballjourney.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/footjourney")
public class UserController {
    private final UserQuestionService userQuestionService;
    private final UserService userService;

    @GetMapping(path = "/user/questions")
    public List<UserQuestion> getUserQuestions() {
        return userQuestionService.getUserQuestions();
    }

    @PostMapping(path = "/user/questions")
    public UserQuestion createUserQuestion(@RequestBody com.example.footballjourney.model.UserQuestion question) {
        return userQuestionService.createUserQuestion(question);
    }

    @DeleteMapping(path = "/user/questions")
    public void deleteUserQuestion(@RequestBody Long id) {
        userQuestionService.deleteUserQuestion(id);
    }

    @GetMapping("/users")
    private List<UserDTO> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/user")
    private UserDTO createUser(@RequestBody NewUser newUser) {
        return userService.createUser(newUser);
    }

    @DeleteMapping("/user/{id}")
    private void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
