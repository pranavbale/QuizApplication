package com.pranavbale.quizapplication.service;

import com.pranavbale.quizapplication.dao.QuestionDAO;
import com.pranavbale.quizapplication.entity.Question;
import com.pranavbale.quizapplication.errorResponse.QuestionNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    QuestionDAO questionDAO;

    @Autowired
    public QuestionService(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }
    public List<Question> getAllQuestions() {
        return questionDAO.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDAO.findByCategory(category);
    }

    public Question addQuestion(Question question) {
        questionDAO.save(question);
        return question;
    }

    public void save(Question question) {
        questionDAO.save(question);
    }

    public void delete(int id) {
        Question theQuestion = new Question();
        theQuestion = questionDAO.findById(id);
        if (theQuestion == null) {
            throw new QuestionNotFoundException("Did not found a Question id : " + id);
        } else {
            questionDAO.delete(theQuestion);
        }
//        questionDAO.deleteById(id);
    }

    public Question findById(int theId) {
        Optional<Question> result = Optional.ofNullable(questionDAO.findById(theId));

        Question theQuestion = null;

        if (result.isPresent()) {
            theQuestion = result.get();
        } else {
            // we didn't find the employee
            throw new QuestionNotFoundException("Did not find Question id - " + theId);
        }

        return theQuestion;
    }
}
