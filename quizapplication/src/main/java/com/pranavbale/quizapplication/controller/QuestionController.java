package com.pranavbale.quizapplication.controller;

import com.pranavbale.quizapplication.entity.Question;
import com.pranavbale.quizapplication.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class QuestionController {

    QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("question/findByCategory/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @GetMapping("question/findById/{theId}")
    public Question fundQuestionById(@PathVariable int theId) {
        Question theQuestion = questionService.findById(theId);

        if (theQuestion == null) {
            throw new RuntimeException("Question id not found - " + theId);
        }

        return theQuestion;
    }

    @PostMapping("question")
    public Question addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
        return question;
    }

    @PutMapping("question")
    public Question updateQuestion(@RequestBody Question question) {
        questionService.save(question);
        return question;
    }

    @DeleteMapping("question/{id}")
    public String deleteQuestion(@PathVariable int id) {
        questionService.delete(id);
        return "deleted successfully Id : " + id;
    }

}
