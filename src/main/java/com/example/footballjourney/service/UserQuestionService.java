package com.example.footballjourney.service;

import com.example.footballjourney.entity.UserQuestion;
import com.example.footballjourney.repository.UserQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserQuestionService {
    private final UserQuestionRepository userQuestionRepository;

    public List<UserQuestion> getUserQuestions() {
        return userQuestionRepository.findAll();
    }

    public UserQuestion createUserQuestion(com.example.footballjourney.model.UserQuestion question) {
        UserQuestion quesEntity = new UserQuestion();
        quesEntity.setQuestion(question.getQuestion());
        return userQuestionRepository.save(quesEntity);
    }

    public void deleteUserQuestion(Long id) {
        userQuestionRepository.deleteById(id);
    }
}
