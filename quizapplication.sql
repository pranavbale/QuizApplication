--
-- Creating a dataBase for the Quiz Application 
--

-- Creating a dataBase

DROP DATABASE IF EXISTS questiondb;

CREATE DATABASE questiondb;
 
 USE questiondb;
 
 -- Creating a question dataBase Table 
 
 DROP TABLE IF EXISTS questions;
 
 CREATE TABLE questions(
 id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
 category VARCHAR(10),
 difficultylevel VARCHAR(20),
 option1 VARCHAR(50),
 option2 VARCHAR(50),
 option3 VARCHAR(50),
 option4 VARCHAR(50),
 question_title VARCHAR(100),
 right_answer VARCHAR(50)
 );
 
 -- Insert some questions in to the questions table 
 
 INSERT INTO questions(category, difficultylevel, option1, option2, option3, option4, question_title, right_answer)
 VALUE ("Java", "Easy", "A blueprint for objects", "A data type", "A method", "A variable", "What is a class in Java?", "A blueprint for objects"),
	   ("Java", "Easy", "Object", "Class", "Superclass", "Parent", "What is the superclass of all Java classes?", "Object"),
       ("HTML", "Easy", "4", "10", "3", "6", "How many sizes of headers are available in HTML by default?", "6"),
       ("HTML", "Easy", ".c", ".html", ".java", ".py", "HTML files are saved by default with the extension?", ".html");
 
 -- Creating a quiz dataBase Table
 
  DROP TABLE IF EXISTS quiz;
  
 CREATE TABLE quiz (
 id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
 title VARCHAR(50)
 );
 
 -- Creating a Coonnectivity table questions_quiz to connect a question and quiz table in many to many join 
 
  DROP TABLE IF EXISTS questions_quiz;

 CREATE TABLE questions_quiz (
 question_id INT,
 quiz_id INT,
 PRIMARY KEY (question_id, quiz_id),
 FOREIGN KEY (question_id) REFERENCES questions(id),
 FOREIGN KEY (quiz_id) REFERENCES quiz(id)
 );
 