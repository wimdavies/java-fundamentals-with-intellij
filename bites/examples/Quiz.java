package bites.examples;

public class Quiz {
    String questionOne;
    String questionTwo;

    public Quiz(String questionOne, String questionTwo) {
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;
    }

    public String getQuestionOne() {
        return questionOne;
    }

    public String getQuestionTwo() {
        return questionTwo;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz("What is Java?", "WHY is Java?");
        System.out.println(quiz.getQuestionOne());
        System.out.println(quiz.getQuestionTwo());
    }
}
