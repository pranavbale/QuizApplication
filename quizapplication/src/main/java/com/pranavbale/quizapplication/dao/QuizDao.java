package com.pranavbale.quizapplication.dao;

import com.pranavbale.quizapplication.entity.Quiz;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
