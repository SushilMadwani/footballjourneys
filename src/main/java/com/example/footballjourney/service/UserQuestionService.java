package com.example.footballjourney.service;

import com.example.footballjourney.entity.User;
import com.example.footballjourney.entity.UserQuestion;
import com.example.footballjourney.repository.UserQuestionRepository;
import com.example.footballjourney.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserQuestionService {
    private final UserQuestionRepository userQuestionRepository;

    public List<UserQuestion> getUserQuestions() {
        return userQuestionRepository.findAll();
    }
}
