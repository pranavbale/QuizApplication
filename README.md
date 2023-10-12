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
<img width="1280" alt="Screenshot 2023-10-12 at 4 52 09 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/5ef9a3fa-1800-41f7-a532-033a397b31d0">

3. Search question  by Id : http://localhost:8080/api/question/findById/3
<img width="1280" alt="Screenshot 2023-10-12 at 4 52 21 PM" src="https://github.com/pranavbale/QuizApplication/assets/78872729/cf1edeb7-6689-49ff-b764-61e36ef98635">
