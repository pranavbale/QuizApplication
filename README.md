**QuizApplication**

I've created this quiz application using Spring Boot 3 and a MySQL database. It's a fun project with a bunch of cool features. Let me break it down for you:

**Spring Boot**: Think of Spring Boot as the magic wand that makes building applications in Java a breeze. It takes away a lot of the nitty-gritty setup, making development faster and more straightforward.

**MySQL Database**: This is where all the data for the quiz app is stored. Questions, answers, user scores, and everything in between – it's all in there.

**Quiz Application**: At the heart of it all is the quiz app itself. Users can join quizzes, answer questions, and get scores. It's like a virtual quiz night!

**APIs**: I've built a set of APIs, which are like little gateways that let other parts of the app and external programs talk to it. These APIs let you do all sorts of things, like create new quizzes, submit answers, and get scores.

**Exception Handling**: Picture this as the safety net of the project. Exception handling helps us deal with hiccups and errors in a graceful way. If something goes wrong, it won't crash the whole app. Instead, it provides clear error messages and keeps things running smoothly.

So, my quiz app is not just about quizzes; it's about making sure users have a good experience, even when things don't go as planned. It can be used for all kinds of scenarios, whether it's for education, entertainment, or just some good old trivia fun.

**Created API's**
1. Gat all questions : http://localhost:8080/api/allQuestions
<img width="1280" alt="Screenshot 2023-10-12 at 4 51 47 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/615c5be3-3e54-4ce8-811f-769d7cabe919">


2. Search questions by category’s : http://localhost:8080/api/question/findByCategory/java

   here "java" is the category
<img width="1280" alt="Screenshot 2023-10-12 at 4 52 09 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/5ef9a3fa-1800-41f7-a532-033a397b31d0">


4. Search question  by ID : http://localhost:8080/api/question/findById/3

   here 3 is the ID
<img width="1280" alt="Screenshot 2023-10-12 at 4 52 21 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/cf1edeb7-6689-49ff-b764-61e36ef98635">


5. Add a question into the database : http://localhost:8080/api/question
<img width="1280" alt="Screenshot 2023-10-12 at 4 52 50 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/a7224771-4d67-47eb-97e7-8e92b3670196">


6. Update a question into the database : http://localhost:8080/api/question
<img width="1280" alt="Screenshot 2023-10-12 at 4 53 52 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/f0f98b34-477c-4d70-89e8-a53522c8732b">


7. Delete a question from the database : http://localhost:8080/api/question/7

   here 7 is the ID
<img width="1280" alt="Screenshot 2023-10-12 at 4 54 09 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/2c0dd9dd-b84b-4b73-b9d3-c67a9094532e">


8. Create a quiz : http://localhost:8080/quiz/create?category=Java&numQ=2&title=JQuiz

   here "java" is the category, 2 is the number of questions and JQuiz is the title of the quiz
<img width="1280" alt="Screenshot 2023-10-12 at 4 54 20 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/49441fe0-f8ea-40af-b8fc-bab374964038">


9. Get the Quiz : http://localhost:8080/quiz/get/1

   here 1 is the quiz ID
<img width="1280" alt="Screenshot 2023-10-12 at 4 54 34 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/ddd7ac0c-f7c3-44e2-8b65-60a7326b8f94">


10. Submit the quiz and get the result : http://localhost:8080/quiz/submit/1

    here 1 is the quiz ID
<img width="1280" alt="Screenshot 2023-10-12 at 4 54 49 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/77fd738e-a1cb-4160-8a14-7557e9c2c5d3">

**Thank You**
