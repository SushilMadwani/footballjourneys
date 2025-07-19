package com.example.footballjourney.repository;

import com.example.footballjourney.entity.UserQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuestionRepository extends JpaRepository<UserQuestion, Long> {
}
